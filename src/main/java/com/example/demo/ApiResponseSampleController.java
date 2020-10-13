package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ApiResponseSampleController {

    @RequestMapping("/res1")
    @ResponseBody
    public Map sample1(){
        return new ApiResponseEntity().sample1("test");
    }

    @RequestMapping("/res2")
    @ResponseBody
    public Map sample2(){
        return new ApiResponseEntity().sample2("test","追加情報です。");
    }

    @RequestMapping("/res3")
    @ResponseBody
    public Map sample3(){
        return new ApiResponseEntity().sample3();
    }

}
