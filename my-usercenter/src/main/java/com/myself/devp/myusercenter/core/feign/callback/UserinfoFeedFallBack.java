package com.myself.devp.myusercenter.core.feign.callback;

import com.myself.devp.myusercenter.core.feign.FeignClientInterface;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class UserinfoFeedFallBack implements FeignClientInterface {
    @Override
    public Map<String, String> getUserInfo() {
        HashMap<String, String> fallback = new HashMap<>();
        fallback.put("fallback","获取用户信息失败");
        System.out.println(fallback.get("fallback"));
        return fallback;
    }
}
