package com.example.demo;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ApiResponseEntity{


    /**
     * 通常の返信電文.
     * @param result
     * @return
     */
    public Map sample1(Object result){
        Map resMap = new HashMap<String, String>();
        resMap.put("state", "I000001");
        resMap.put("massage", "Succeeds");
        resMap.put("result", result);

        return resMap;
    }

    /**
     * 追加情報付き返信電文.
     * @param result result結果
     * @param additional 追加情報
     * @return
     */
    public Map sample2(Object result, Object additional){
        Map resMap = new HashMap<String, String>();
        resMap.put("state", "I000001");
        resMap.put("massage", "Succeeds");
        resMap.put("result", result);
        resMap.put("additional", additional);

        return resMap;
    }

    /**
     * resultがnullの返信電文.
     * @return
     */
    public Map sample3(){
        Map resMap = new HashMap<String, String>();
        resMap.put("state", "I000001");
        resMap.put("massage", "Succeeds");
        resMap.put("result", "");

        return resMap;
    }

}
