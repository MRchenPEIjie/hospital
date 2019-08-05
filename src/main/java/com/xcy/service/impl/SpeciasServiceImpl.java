package com.xcy.service.impl;

import com.xcy.mapper.SpeciaMapper;
import com.xcy.pojo.Department;
import com.xcy.pojo.Patient;
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


}
