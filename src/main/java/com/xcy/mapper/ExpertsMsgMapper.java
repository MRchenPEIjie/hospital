package com.xcy.mapper;

import com.xcy.pojo.Experts;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExpertsMsgMapper {
    Experts expertsMsg(int id);
}
