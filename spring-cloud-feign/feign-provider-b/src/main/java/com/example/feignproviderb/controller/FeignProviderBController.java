package com.example.feignproviderb.controller;

import com.example.feignproviderb.service.FeignProviderBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class FeignProviderBController {

    @Resource
    FeignProviderBService feignProviderBService;

    @GetMapping("providerB")
    public String providerB() {
        feignProviderBService.providerB();
        return "providerB";
    }
}
