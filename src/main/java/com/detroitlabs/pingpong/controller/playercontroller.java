package com.detroitlabs.pingpong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class playercontroller {

    @RequestMapping("/")
    public String displayHomepage(){
        return "home";
    }

}
