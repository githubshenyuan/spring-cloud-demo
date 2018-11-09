package com.example.springcloudfeignclient.Controller;

import com.example.api.UserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sh_home on 2018/11/9 18:33
 * @version ideaIU-2018.2.3.win
 */
@RestController
public class ClientController {
    @Autowired
    UserApi userApi;
    @GetMapping("/get")
    public String getUser() {
        userApi.setUser("123", "123");
        return null;
    }

}
