package com.lucian.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("admin/hello")
    public String hello1(){
        return "hello1";
    }

    @GetMapping("db/hello")
    public String hello2(){
        return "hello2";
    }

    @GetMapping("user/hello")
    public String hello3(){
        return "hello3";
    }
}
