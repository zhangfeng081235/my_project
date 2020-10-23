package com.myself.devp.myusercenter.core.controller;

import com.myself.devp.myusercenter.core.feign.impl.FeignClientInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserInfoController {
    @Autowired
    private FeignClientInterfaceImpl feignClientInterfaceImpl;

    @GetMapping("/getUserInfo")
    public  Map<String,String>  getUserInfos(){
       Map<String,String> map= feignClientInterfaceImpl.getUserInfo();
        System.out.println(map.toString());
        return map;
    }

}
