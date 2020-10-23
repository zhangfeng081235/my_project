package com.myself.devp.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class GatewayController {
    @GetMapping("/userinfo")
    public Map<String,String> getUserInfo(){
        HashMap<String, String> user = new HashMap<>();
        user.put("name","zhangsan");
        user.put("age","12");
        user.put("sex","男");
        return  user;
    }
}
