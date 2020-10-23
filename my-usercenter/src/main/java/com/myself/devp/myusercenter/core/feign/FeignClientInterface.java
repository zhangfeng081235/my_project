package com.myself.devp.myusercenter.core.feign;

import com.myself.devp.myusercenter.core.feign.callback.UserinfoFeedFallBack;
import com.myself.devp.myusercenter.core.filter.FeignAcceptGzipEncodingIntercepter;
import com.myself.devp.myusercenter.core.filter.LoggerFilter;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "GATEWAY",fallback = UserinfoFeedFallBack.class,configuration = {FeignAcceptGzipEncodingIntercepter.class, LoggerFilter.class})
public interface FeignClientInterface {

    @GetMapping("/userinfo")
    Map<String,String>  getUserInfo();
}
