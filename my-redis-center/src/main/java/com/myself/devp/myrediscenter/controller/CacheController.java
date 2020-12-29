package com.myself.devp.myrediscenter.controller;

import com.myself.devp.myrediscenter.model.SBasLog;
import com.myself.devp.myrediscenter.model.SBasLogExample;
import com.myself.devp.myrediscenter.service.SBasLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CacheController {

    @Autowired
    private SBasLogService  sBasLogServiceImpl;

    @GetMapping("/getSBasLog")
    public List<SBasLog>  getSBasLog(){
        SBasLogExample sBasLogExample = new SBasLogExample();
        List<SBasLog> sBasLogs = sBasLogServiceImpl.selectByExample(sBasLogExample);
        return  sBasLogs;
    }
}
