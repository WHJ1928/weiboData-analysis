package com.whj.dataanalysis.service;

import com.whj.dataanalysis.dao.FollowList;
import com.whj.dataanalysis.mapper.FollowListMapper;
import com.whj.dataanalysis.mapper.WeiboMapper;
import com.whj.dataanalysis.util.StringUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author wanghaijun
 * @date 2018/9/6
 * @desc
 */
@Service
public class FollowService {
    @Autowired
    private FollowApi followApi;
    @Autowired
    private WeiboMapper weiboMapper;
    @Autowired
    private FollowListMapper listMapper;

    /**
     * 保存查到的数据
     * @throws IOException
     * @throws JSONException
     */
    public void saveFollowList(){
        try{
//            List<String> strings =weiboMapper.selectUserId();
            String[] strings = {
//                    "1077585930","1188028704","1195054531","1214071905","1222135407", "1235572171",
//                    "1260366185","1315584977","1339907495","1343692175","1497415677","1526829773","1529573474",
//                    "1640155995","1642632622","1645808994","1646225921","1647203525","1649392567","1655459775",
//                    "1659674142","1660529411","1696522031","1729014640","1730177302","1735747402","1737956657",
//                    "1764494437", "1785289351","1791371917","1791762275","1813341992","1821944837","1828289207",
//                    "1829022565","1829387325","1829844011","1831650534","1848593583","1853568305","1853855095",
//                    "1862961041","1862961765","1870858943","1904769205","1919681195","1924858885","1929665032",
//                    "1955238877","1969054465","2012581457","2030934575","2033293424","2041013452","2050114737",
//                    "2073915493","2092792164","2105213367","2110530745","2122129465","2134275663","2141944941",
//                    "2144927003","2177890963","2196101411","2198327814","2201275590","2212518065","2232993991",
//                    "2239580202","2246012062","2268904744","2279408463","2298297865","2304618037","2383648810",
//                    "2424878292","2427364747","2456753194","2477311817","2504702883","2558436234","2571565214",
//                    "2591095124","2593325252","2593584172","2604980670","2647194081","2649302073","2661129571",
//                    "2705189521","2736034997","2737697017","2753495387", "2775892915","2785509645","2787728917",
//                    "2796923361","2798448382","2804935594","2824982950","2860279695","2949617444","3073561605",
//                    "3105976555","3186302852","3201761021","3226359945","3270708414","3275213384","3353712502",
//                    "3494982177","3516122664","3540607485","3543329232","3614664800","3751111037","3773692154",
//                    "3846319596","3847741679","3865427681","3874971622","3889212468","3953745253","3996876140",
                    "5049488642","5074404116","5077999975","5081292403","5094731364","5103305851","5104880035",
                    "5225475115","5228062899","5310460242","5323574069","5340174229","5341251100","5356414944",
                    "5360078827","5385763896","5456052217","5469025145","5512453661","5514571145","5583896974",
                    "5641213278","5669935523","5705191799","5706862124","5776349093","5819267164","5822945028",
                    "5838191069","5901078375","6015300270","6060025758","6152293350","6154333336","6304574435",
                    "6368596722","6409833518"};
            for (String userId: strings){
                List<FollowList> followLists = new ArrayList<>();
                JSONArray cardList = followApi.getFollowList(userId);
                if (!ObjectUtils.isEmpty(cardList)){
                    for (int i = 0; i < cardList.length(); i++){
                        JSONObject follow = cardList.getJSONObject(i);
                        JSONObject userInfo = follow.getJSONObject("user");
                        FollowList followList = new FollowList();
                        followList.setId("F"+ StringUtil.getId());
                        followList.setUserId(userId);
                        followList.setFollowUserId(userInfo.get("id").toString());
                        followList.setFollowUsername(userInfo.getString("screen_name"));
                        followList.setFollowUserFans(userInfo.get("followers_count").toString());
                        followList.setFollowUserFol(userInfo.get("follow_count").toString());
                        String followMe = userInfo.get("follow_me").toString();
                        if (!"false".equals(followMe)){
                            followList.setMutualFans("1");
                        }else {
                            followList.setMutualFans("0");
                        }
                        followLists.add(followList);
                    }
                    listMapper.batchSaveFollowList(followLists);
                }
                Thread.sleep(2500);
                System.out.println("用户暂停" + userId);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
