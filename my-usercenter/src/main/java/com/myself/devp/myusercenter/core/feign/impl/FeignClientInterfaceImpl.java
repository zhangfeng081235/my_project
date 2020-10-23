package com.myself.devp.myusercenter.core.feign.impl;

import com.myself.devp.myusercenter.core.feign.FeignClientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
public class FeignClientInterfaceImpl  {
    @Autowired
    private FeignClientInterface feignClientInterface;

    public Map<String, String> getUserInfo() {
        Map<String, String> userInfo = feignClientInterface.getUserInfo();
        return userInfo;

    }
}
