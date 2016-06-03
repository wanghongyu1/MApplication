package com.example.myutils;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by Administrator on 2016/5/6.
 */
public class MyUtils {


    static String  Url="http://m.yunifang.com/yunifang/mobile/goods/getall?random=9949&encode=6c2154232994e7d36ad461e3caa68ca7";

    public static String Check_j(String url){
        String str="";
        StringBuffer sb=new StringBuffer(url);
        try {
            URI myurl=new URI(sb.toString());
           

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        // HttpURLConnection
        return str;

    }
}
