package com.example.feigninvoke.service.impl;

import com.example.feigninvoke.feign.FeignProvider;
import com.example.feigninvoke.service.FeignService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FeignServiceImpl implements FeignService {

    @Resource
    FeignProvider feignProvider;

    @Override
    public String invoke() {
        return feignProvider.providerA();
    }
}
