package com.dlzhangjoy.springinaction;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
    @RequestMapping("/home2")
    public String home2(){
        return "home2";
    }
}
