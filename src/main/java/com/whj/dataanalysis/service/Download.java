package com.whj.dataanalysis.service;

import com.whj.dataanalysis.dao.BlogWithBLOBs;
import com.whj.dataanalysis.dao.Weibo;
import com.whj.dataanalysis.dao.WeiboExample;
import com.whj.dataanalysis.mapper.BlogMapper;
import com.whj.dataanalysis.mapper.WeiboMapper;
import com.whj.dataanalysis.util.ListUtil;
import com.whj.dataanalysis.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author wanghaijun
 * @date 2018/8/2
 * @desc
 */
@Service
public class Download {
    private static Pattern NUMBER_PATTERN = Pattern.compile("[^0-9]");
    @Autowired
    private BlogMapper blogMapper;
    @Autowired
    private WeiboMapper weiboMapper;

    /**
     * 获取微博信息
     */
    public void saveInfo(){
        String[] strings = {"1077585930","1188028704","1195054531","1214071905","1222135407","1235572171","1260366185",
                "1339907495","1343692175","1497415677","1526829773","1529573474","1640155995","1642632622","1645808994",
                "1646225921","1647203525","1649392567","1655459775","1659674142","1660529411","1696522031","1729014640",
                "1730177302","1735747402","1737956657","1764494437","1785289351","1791371917","1813341992","1821944837",
                "1828289207","1829022565","1829387325","1829844011","1831650534","1848593583","1853568305","1853855095",
                "1862961041","1862961765","1870858943","1904769205","1919681195","1924858885","1929665032","1955238877",
                "1969054465","2012581457","2030934575","2033293424","2041013452","2050114737","2073915493","2092792164",
                "2105213367","2110530745","2122129465","2134275663","2141944941","2144927003","2177890963","2196101411",
                "2198327814","2201275590","2212518065","2232993991","2239580202","2246012062","2279408463","2298297865",
                "2304618037","2383648810","2424878292","2427364747","2456753194","2477311817","2504702883","2558436234",
                "2571565214","2591095124","2593325252","2593584172","2604980670","2647194081","2661129571","2736034997",
                "2737697017","2753495387","2775892915","2785509645","2787728917","2796923361","2798448382","2804935594",
                "2824982950","2860279695","2949617444","3186302852","3201761021","3226359945","3270708414","3275213384",
                "3353712502","3494982177","3516122664","3540607485","3543329232","3614664800","3751111037","3773692154",
                "3846319596","3865427681","3874971622","3889212468","3953745253","3996876140","5049488642","5074404116",
                "5077999975","5081292403","5094731364","5103305851","5104880035","5225475115","5228062899","5310460242",
                "5323574069","5340174229","5341251100","5356414944","5360078827","5385763896","5456052217","5469025145",
                "5512453661","5514571145","5583896974","5641213278","5669935523","5705191799","5706862124","5776349093",
                "5819267164","5822945028","5838191069","5901078375","6015300270","6060025758","6152293350","6154333336",
                "6304574435","6368596722","6409833518","1315584977"};
        for (int i =0;i<strings.length;i++){
            String id = strings[i];
            System.out.println("开始 userId="+id);
            File file = new File("D:\\pythonTest\\spider\\WeiBoApi\\"+id+".txt");
            List<BlogWithBLOBs> blogList = new ArrayList<>();
            try{
                //构造一个BufferedReader类来读取文件
//                BufferedReader br = new BufferedReader(new FileReader(file));
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
                String content =null;
                //使用readLine方法，一次读一行
                while((content = br.readLine())!=null){
                    String page = content;
                    BlogWithBLOBs blog = new BlogWithBLOBs();
                    if ((content = br.readLine())!=null){
                        //blog.setBlogAdd(content.split("：")[1].trim());
                        blog.setBlogAdd(content.substring(content.lastIndexOf("：")+1));
                    }
                    if ((content = br.readLine())!=null){
                        blog.setCreatedTime(content.substring(content.lastIndexOf("：")+1));
                    }
                    if ((content = br.readLine())!=null){
                        blog.setText(content.substring(content.lastIndexOf("：")+1));
                        //blog.setText(content.split("：")[1].trim());
                        if (content.contains("转发微博")||content.contains("轉發微博")){
                            blog.setOriginalFlag("0");
                        }else {
                            blog.setOriginalFlag("1");
                        }
                    }
                    if ((content = br.readLine())!=null){
                        blog.setLikesNum(NUMBER_PATTERN.matcher(content).replaceAll(""));
                    }
                    if ((content = br.readLine())!=null){
                        blog.setCommentNum(NUMBER_PATTERN.matcher(content).replaceAll(""));
                    }
                    if ((content = br.readLine())!=null){
                        blog.setForwardNum(NUMBER_PATTERN.matcher(content).replaceAll(""));
                    }
                    blog.setUserId(id);
//                    blog.setBlogId(String.valueOf(ThreadLocalRandom.current().nextInt(100000) + 100));
                    blog.setBlogId("B"+ StringUtil.getId());
                    blogList.add(blog);
                }
                br.close();
                if (blogList.size()>500){
                    List<List<BlogWithBLOBs>> lists = ListUtil.split(blogList,500);
                    for (List<BlogWithBLOBs> blogs:lists){
                        blogMapper.batchSave(blogs);
                    }
                }else {
                    blogMapper.batchSave(blogList);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println("结束 userId="+id);
        }
    }

    /**
     * 更新微博信息
     */
    public void saveWbInfo(){
        File file = new File("D:\\pythonTest\\spider\\test\\微博数据.txt");
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
            String content =null;
            List<Weibo> blogList = new ArrayList<>();
            //使用readLine方法，一次读一行
            while((content = br.readLine())!=null){
                String userId = NUMBER_PATTERN.matcher(content).replaceAll("");
                WeiboExample example = new WeiboExample();
                example.createCriteria().andUseridEqualTo(userId);
                Weibo weibo = new Weibo();
                if ((content = br.readLine())!=null){
                    weibo.setBlognum(Long.parseLong(NUMBER_PATTERN.matcher(content).replaceAll("")));
                }
                if ((content = br.readLine())!=null){
                    weibo.setFollownum(Long.parseLong(NUMBER_PATTERN.matcher(content).replaceAll("")));
                }
                if ((content = br.readLine())!=null){
                    weibo.setFansnum(Long.parseLong(NUMBER_PATTERN.matcher(content).replaceAll("")));
                }
                weiboMapper.updateByExampleSelective(weibo,example);
                System.out.println("用户"+userId+"更新完成");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
