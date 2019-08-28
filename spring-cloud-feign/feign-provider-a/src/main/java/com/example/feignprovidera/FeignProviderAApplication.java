package com.example.feignprovidera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FeignProviderAApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignProviderAApplication.class, args);
    }

}
