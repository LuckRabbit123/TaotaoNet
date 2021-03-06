package com.taotao.controller;


import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/test/qureyNow")
    @ResponseBody
    public String queryNow(){
        //注入service
        //业务
        //调用
        return testService.queryNow();

    }
}
