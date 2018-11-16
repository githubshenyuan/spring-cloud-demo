package com.example.springbootdevtoolsdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh_home on 2018/11/9 22:54
 * @version ideaIU-2018.2.3.win
 */
@RestController
public class DevtoolsController {
    @GetMapping("dev")
    public String dev() {
        System.out.println("访问----12-324");
        return "dev---";
    }
}
