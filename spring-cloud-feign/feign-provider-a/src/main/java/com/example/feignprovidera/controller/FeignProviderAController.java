package com.example.feignprovidera.controller;

import com.example.feignprovidera.service.FeignProviderAService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignProviderAController {

    @Resource
    FeignProviderAService feignProviderAService;


    @GetMapping("providerA")
    public String providerA() {
        feignProviderAService.providerA();
        return "providerA";
    }
}
