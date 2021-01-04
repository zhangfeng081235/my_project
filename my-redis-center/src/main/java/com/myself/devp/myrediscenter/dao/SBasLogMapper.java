package com.myself.devp.myrediscenter.dao;

import com.myself.devp.myrediscenter.model.SBasLog;
import com.myself.devp.myrediscenter.model.SBasLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SBasLogMapper {
    int countByExample(SBasLogExample example);

    int deleteByExample(SBasLogExample example);

    int insert(SBasLog record);

    int insertSelective(SBasLog record);

    List<SBasLog> selectByExample(SBasLogExample example);

    int updateByExampleSelective(@Param("record") SBasLog record, @Param("example") SBasLogExample example);

    int updateByExample(@Param("record") SBasLog record, @Param("example") SBasLogExample example);
}