package com.example.feigninvoke.feign;

import com.example.feigninvoke.feign.fallback.FeignProviderFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "FEIGN-PROVIDER-A", fallback = FeignProviderFallback.class)
public interface FeignProvider {
    @GetMapping("providerA")
    public String providerA();
}
