package com.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    /**
     * 首页显示
     */
    @RequestMapping("/")
    public String showIndex() {
        return "index";
    }
    /**
     * 展示菜单页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showItemList(@PathVariable String page){
        return page;
    }

}
