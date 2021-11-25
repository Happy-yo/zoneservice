package com.litterservice.zone.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PrintLog {

    private static ObjectMapper objectMapper = new ObjectMapper();


    public static void printLog(String url, Object o) {
        System.out.println("*************服务器请求*************");
        System.out.println("URL:" + url);
        System.out.println("-------------请求数据---------------");
        if(o != null) {
            try {
                System.out.println(objectMapper.writeValueAsString(o));
            } catch (JsonProcessingException var3) {
                var3.printStackTrace();
            }
        }

    }

}