package com.example.springcloudfeignserver.Controller;

import com.example.api.UserApi;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh_home on 2018/11/9 18:29
 * @version ideaIU-2018.2.3.win
 */
@RestController
public class UserController implements UserApi {

    @Override
    @GetMapping("/getUser")
    public String getUser() {
        System.out.println("获取用户");
        return "username";
    }

    @Override
    @PostMapping("/setUser")
    public void setUser(@RequestParam(name = "userName")String userName , @RequestParam(name = "password") String password) {
        System.out.println("注册用户");
    }


}
