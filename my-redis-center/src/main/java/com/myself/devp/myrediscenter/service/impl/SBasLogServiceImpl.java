package com.myself.devp.myrediscenter.service.impl;

import com.myself.devp.myrediscenter.dao.SBasLogMapper;
import com.myself.devp.myrediscenter.model.SBasLog;
import com.myself.devp.myrediscenter.model.SBasLogExample;
import com.myself.devp.myrediscenter.service.SBasLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SBasLogServiceImpl  implements SBasLogService {
    @Autowired
    private SBasLogMapper sBasLogMapper;

    @Override
    public int countByExample(SBasLogExample example) {
        return 0;
    }

    @Override
    public int deleteByExample(SBasLogExample example) {
        return 0;
    }

    @Override
    public int insert(SBasLog record) {
        return 0;
    }

    @Override
    public int insertSelective(SBasLog record) {
        return 0;
    }

    @Override
    public List<SBasLog> selectByExample(SBasLogExample example) {
        return null;
    }

    @Override
    public int updateByExampleSelective(SBasLog record, SBasLogExample example) {
        return 0;
    }

    @Override
    public int updateByExample(SBasLog record, SBasLogExample example) {
        return 0;
    }
}
