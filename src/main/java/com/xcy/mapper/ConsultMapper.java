package com.xcy.mapper;

import com.xcy.pojo.ConsultAndThanks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConsultMapper {
    int insertConsult(ConsultAndThanks consultAndThanks);
}
