package com.xcy.mapper;

import com.xcy.pojo.Health;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface HealthMapper {

    Health showHealth(int id);

    Health showHeal();

}
