package com.xcy.mapper;

import com.xcy.pojo.ConsultAndThanks;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ThanksMapper {
    int insertThanks(ConsultAndThanks consultAndThanks);
}
