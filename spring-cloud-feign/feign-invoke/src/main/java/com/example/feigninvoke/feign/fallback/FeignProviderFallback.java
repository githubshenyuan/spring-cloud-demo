package com.example.feigninvoke.feign.fallback;

import com.example.feigninvoke.feign.FeignProvider;
import org.springframework.stereotype.Component;

@Component
public class FeignProviderFallback implements FeignProvider {

    @Override
    public String providerA() {
        return "fall";
    }

}
