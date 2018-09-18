package com.whj.dataanalysis.service;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/**
 * @author wanghaijun
 * @date 2018/9/6
 * @desc
 */
@Component
public class FollowApi {

    @Autowired
    private WeiboApi weiboApi;

    /**
     * 获取关注列表
     * @param userId
     * @return
     * @throws IOException
     * @throws JSONException
     */
    public JSONArray getFollowList(String userId)throws IOException, JSONException,InterruptedException{
        int page = 1;
        JSONArray cardGroup = new JSONArray();
        do {
//            String url = "https://m.weibo.cn/api/container/getIndex?containerid=231051_-_followers_-_"+userId;
            String url = "https://m.weibo.cn/api/container/getSecond?containerid=100505"+userId+"_-_FOLLOWERS&page="+page;
            JSONObject jsonObject = getRequest(url);
            String ok = jsonObject.get("ok").toString();
            if (!ok.equals("1")){
                break;
            }
            JSONObject data = jsonObject.getJSONObject("data");
            JSONArray cards = data.getJSONArray("cards");
            for (int i = 0; i < cards.length(); i++){
                JSONObject card = cards.getJSONObject(i);
                cardGroup.put(card);
            }
            page ++;
            Thread.sleep(50);
        }while (true);
        return cardGroup;
    }


    public JSONObject getRequest(String url) throws IOException, JSONException {
        //添加代理
        System.getProperties().setProperty("http.proxyHost", "122.241.72.191");
        System.getProperties().setProperty("http.proxyPort", "808");
//        System.getProperties().setProperty("http.proxyHost", "125.94.0.251");
//        System.getProperties().setProperty("http.proxyPort", "8080");
        URL realUrl = new URL(url);
        URLConnection conn = realUrl.openConnection();
        conn.setRequestProperty("accept", "*/*");
        conn.setRequestProperty("connection", "Keep-Alive");
        conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) " +
                "Chrome/49.0.2623.221 Safari/537.36 SE 2.X MetaSr 1.0");
        conn.connect();
        InputStream inputStream = conn.getInputStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
//            String jsonText = weiboApi.readAll(rd);
            StringBuffer sb = new StringBuffer();
            String line = null;
            //读取数据
            while((line= rd.readLine())!=null){
                sb.append(line);
            }
            JSONObject json = new JSONObject(sb.toString());
            return json;
        }finally {
            inputStream.close();
        }
    }
}
