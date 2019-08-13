package com.xcy.service.impl;

import com.xcy.mapper.SpeciaMapper;
import com.xcy.pojo.*;
import com.xcy.service.SpeciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SpeciasServiceImpl implements SpeciaService {

    @Resource
    SpeciaMapper speciaMapper;

    public Department showSpeciaInfo(Integer id){

        Department department = speciaMapper.showSpeciaInfo(id);


        return department;
    }

    @Override
    public String saveAdvisory(Patient patient) {

        int i = speciaMapper.saveAdvisory(patient);

        if (0 == i){
            return "fail";
        }


        return "success";
    }

    @Override
    public TimeTable showTemplate() {

        TimeTable timeTable = speciaMapper.showTemplate();

        return timeTable;
    }

    @Override
    public Experts showExperts(Integer id) {

        Experts experts = speciaMapper.showExperts(id);

        return experts;
    }

    @Override
    public ExpertsAndDepartment showExpertsList(Integer departmentId) {
        ExpertsAndDepartment expertsAndDepartment = speciaMapper.showExpertsList(departmentId);

        return expertsAndDepartment;
    }


}
