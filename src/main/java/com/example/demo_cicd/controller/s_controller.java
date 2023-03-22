package com.example.demo_cicd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class s_controller {
    @RequestMapping("/getName")
    public String getName(){
        return "Shubham";
    }
    
}
