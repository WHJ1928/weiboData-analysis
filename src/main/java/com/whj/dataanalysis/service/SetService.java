package com.whj.dataanalysis.service;

import com.whj.dataanalysis.dao.Weibo;
import com.whj.dataanalysis.dao.WeiboExample;
import com.whj.dataanalysis.mapper.WeiboMapper;
import com.whj.dataanalysis.util.ListUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author wanghaijun
 * @date 2018/7/31
 * @desc
 */
@Service
public class SetService {
    @Autowired
    private WeiboApi weiboApi;
    @Autowired
    private WeiboMapper weiboMapper;

    public void saveUserInfo() throws IOException, JSONException,InterruptedException{
        int i =0; int j = 0;
        List<String> strings =weiboMapper.selectUserId();
        List<List<String>> lists = ListUtil.split(strings,180);
        for (List<String> stringList:lists){
            for (String userId:strings){
                WeiboExample weiboExample = new WeiboExample();
                weiboExample.createCriteria().andUseridEqualTo(userId);
                int sum = 0;
                for (int page = 1; page<2000;page++) {
                    //String url = "http://api01.bitspaceman.com:8000/profile/weibo?apikey=iYNjME6UyLzCvrwHsct6oyknIwh2RVQt4VmtZac2AnsvY9gC025ghNP6OpYFXTp6&id="+userId+"&type=1";
                    String url = "http://api01.bitspaceman.com:8000/post/weibo?apikey=iYNjME6UyLzCvrwHsct6oyknIwh2RVQt4VmtZac2AnsvY9gC025ghNP6OpYFXTp6&uid=" + userId + "&type=original&pageToken=" + page;
                    JSONObject jsonObject = weiboApi.getRequestFromUrl(url);
                    JSONArray jsonArray = (JSONArray) jsonObject.getJSONArray("data");
//                JSONObject object = (JSONObject) jsonArray.getJSONObject(0);
                    Weibo weibo = new Weibo();
//                weibo.setHomelink(object.getString("url"));
//                weibo.setBlogauthenticate(object.getString("idVerifiedInfo"));
//                weibo.setRegistrationtime(object.getString("registerDate"));
                    Thread.sleep(3000);
                    sum = sum+jsonArray.length();
                    i++;
                    System.out.println("页面暂停" + "  " + i);
                    if (jsonArray.length() == 0){
                        weibo.setOriginalblognum((long) sum);
                        weiboMapper.updateByExampleSelective(weibo, weiboExample);
                        break;
                    }
                }
                Thread.sleep(3000);
                System.out.println("用户暂停" + "  " + j);
            }
        }
    }
}
