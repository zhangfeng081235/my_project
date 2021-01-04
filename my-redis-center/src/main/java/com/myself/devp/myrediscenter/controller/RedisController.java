package com.myself.devp.myrediscenter.controller;


import com.myself.devp.myrediscenter.config.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedisController {

     @Autowired
     private  RedisUtils  redisUtils;

     @GetMapping("/redisOpt1")
     public  String   redisOpt1(){
          redisUtils.set("redis-key","1");
          Object o = redisUtils.get("redis-key");
          return String.valueOf(o);
     }
}
