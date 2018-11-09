package com.example.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sh_home on 2018/11/9 18:16
 * @version ideaIU-2018.2.3.win
 */
@FeignClient(name = "spring-cloud-feign-server", fallback = UserHystrix.class)
public interface UserApi {
    @GetMapping("/getUser")
    public String getUser();
    @PostMapping("/setUser")
    public void setUser(@RequestParam(name = "userName") String userName, @RequestParam(name = "password") String password);
}
