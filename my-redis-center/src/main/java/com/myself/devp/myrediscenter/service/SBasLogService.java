package com.myself.devp.myrediscenter.service;


import com.myself.devp.myrediscenter.model.SBasLog;
import com.myself.devp.myrediscenter.model.SBasLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SBasLogService {

    int countByExample(SBasLogExample example);

    int deleteByExample(SBasLogExample example);

    int insert(SBasLog record);

    int insertSelective(SBasLog record);

    List<SBasLog> selectByExample(SBasLogExample example);

    int updateByExampleSelective(@Param("record") SBasLog record, @Param("example") SBasLogExample example);

    int updateByExample(@Param("record") SBasLog record, @Param("example") SBasLogExample example);
}
