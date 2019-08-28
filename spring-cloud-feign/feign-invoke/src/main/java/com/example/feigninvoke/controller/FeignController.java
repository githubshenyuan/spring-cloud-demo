package com.example.feigninvoke.controller;

import com.example.feigninvoke.service.FeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignController {

    @Resource
    FeignService feignService;
    @GetMapping("invokeA")
    public String invokeA() {
        return feignService.invoke();
    }
}
