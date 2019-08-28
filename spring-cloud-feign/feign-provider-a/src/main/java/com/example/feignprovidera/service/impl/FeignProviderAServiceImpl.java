package com.example.feignprovidera.service.impl;


import com.example.feignprovidera.service.FeignProviderAService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class FeignProviderAServiceImpl implements FeignProviderAService {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Override
    public String providerA() {
        logger.info("服务提供者 A  服务层 输出");
        return null;
    }
}
