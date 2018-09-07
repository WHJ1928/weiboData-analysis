package com.whj.dataanalysis.controller;

import com.whj.dataanalysis.service.Download;
import com.whj.dataanalysis.service.FollowService;
import com.whj.dataanalysis.service.SetOriginalService;
import com.whj.dataanalysis.service.SetService;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author wanghaijun
 * @date 2018/7/31
 * @desc
 */
@RestController
public class SetController {

    @Autowired
    private SetService setService;
    @Autowired
    private SetOriginalService originalService;
    @Autowired
    private Download download;
    @Autowired
    private FollowService followService;

    @RequestMapping(value = "/query/userinfo",method = RequestMethod.GET)
    public void saveUserInfo() throws IOException,JSONException,InterruptedException{
        setService.saveUserInfo();
    }

    @RequestMapping(value = "/save/user",method = RequestMethod.GET)
    public void saveUser(){
        originalService.setOriginal();
    }

    @RequestMapping(value="/save/info",method= RequestMethod.GET)
    public void saveInfo(){
        download.saveInfo();
    }

    /**
     * 更新微博信息
     */
    @RequestMapping(value="/updata/info",method= RequestMethod.GET)
    public void updataInfo(){
        download.saveWbInfo();
    }

    /**
     * 查询并保存关注列表
     */
    @RequestMapping(value="/query/follow",method= RequestMethod.GET)
    public void saveFollowList(){
        followService.saveFollowList();
    }
}
