package com.dlzhangjoy.springinaction.chapter9;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chapter9")
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hellController";
    }
}
