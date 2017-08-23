package com.zg.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fengshuo on 2017/8/23.
 */
@Controller
public class indexController {

    //主页
    @RequestMapping("/")
    private String index(){
        return "home/home";
    }

    //页面头
    @RequestMapping("head")
    private String head(){
        return "head";
    }

    //页面尾
    @RequestMapping("foot")
    private String foot(){
        return "foot";
    }
}
