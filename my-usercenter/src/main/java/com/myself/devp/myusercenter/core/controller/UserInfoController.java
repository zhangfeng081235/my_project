package com.myself.devp.myusercenter.core.controller;

import com.myself.devp.myusercenter.core.feign.impl.FeignClientInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
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


    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
        int nano = now.getNano();
        System.out.println(now.toString());
        System.out.println("当前秒数："+second);

        long l1=28839L;
        long l2=22323L;
        if (l1-l2 >=0){
            System.out.println(true);
        }else{
            System.out.println(false);

        }
    }

}
