package com.lianjia.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chen on 2018/4/5.
 */
@Controller
public class IndexController {


    @GetMapping({"/",
            "/index/**",
            "/hello/**"})
    public String index(){
        return "index";
    }
}
