package com.whj.dataanalysis.util;

import java.util.Date;

/**
 * @author wanghaijun
 * @date 2018/9/7
 * @desc
 */
public class StringUtil {

    public static String getRandom(){
        //获取一个随机数
        double rand = Math.random();
        //将随机数转换为字符串
        String str = String.valueOf(rand).replace("0.", "");
        //截取字符串
        return str.substring(0, 8);
    }

    /**
     * 获取精确到秒的时间戳
     * @return
     */
    public static String getTimestamp(){
        Date date = new Date();
//        String timestamp = String.valueOf(date.getTime()/1000);
        String timestamp = String.valueOf(date.getTime());
        return timestamp;
    }

    public static  String getId(){
        return getTimestamp()+getRandom();
    }
}
