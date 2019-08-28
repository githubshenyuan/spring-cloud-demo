package com.example.feignproviderb.service.impl;


import com.example.feignproviderb.service.FeignProviderBService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FeignProviderBServiceImpl implements FeignProviderBService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String providerB() {
        logger.info("服务提供者 B  服务层 输出");
        return null;
    }
}
