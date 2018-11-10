package com.example.springbootsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh_home on 2018/11/9 23:56
 * @version ideaIU-2018.2.3.win
 */
@RestController
public class UserController {
    @GetMapping("get")
    public String getUser(String name) {
        System.out.println("查询用户");
        return name;
    }
}
