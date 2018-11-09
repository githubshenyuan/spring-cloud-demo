package com.example.api;

/**
 * @author sh_home on 2018/11/9 18:21
 * @version ideaIU-2018.2.3.win
 */
public class UserHystrix implements UserApi {
    public String getUser() {
        System.out.println("断路器");
        return null;
    }

    public void setUser(String userName ,String password) {
        System.out.println("断路器");
    }
}
