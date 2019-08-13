package com.xcy.mapper;


import com.xcy.pojo.Brief;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BriefMapper {

    String selectBrief(Brief brief);

}
