package com.practice.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TopController {
    @RequestMapping(value = "/")
    public String top(){
        return "top";
    }
}
