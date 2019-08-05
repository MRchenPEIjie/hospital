package com.xcy.mapper;

import com.xcy.pojo.Department;
import com.xcy.pojo.Patient;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SpeciaMapper {

    public Department showSpeciaInfo(Integer id);

    public int saveAdvisory(Patient patient);

}
