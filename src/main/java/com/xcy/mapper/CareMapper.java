package com.xcy.mapper;

import com.xcy.pojo.Care;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CareMapper {

    Care careWorldInfo(int id);

    Care careWorld();

}
