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
            List<String> strings =weiboMapper.selectUserId();
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
                Thread.sleep(2000);
                System.out.println("用户暂停" + "用户:" + userId);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
