package com.xcy.mapper;

import com.xcy.pojo.*;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface SpeciaMapper {

    public Department showSpeciaInfo(Integer id);

    public int saveAdvisory(Patient patient);

    public TimeTable showTemplate();

    Experts showExperts(Integer id);

    ExpertsAndDepartment showExpertsList(Integer departmentId);

}
