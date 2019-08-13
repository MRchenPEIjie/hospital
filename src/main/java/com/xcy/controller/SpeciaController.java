package com.xcy.controller;


import com.xcy.pojo.*;
import com.xcy.service.SpeciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpeciaController {

    @Autowired
    SpeciaService speciaService;

    @RequestMapping("department")
    public Department showList(Integer id){

        System.out.println(id);

        Department speciaInfo = speciaService.showSpeciaInfo(id);


        return speciaInfo;
    }

    //保存就诊信息
    @RequestMapping("saveAdvisory")
    public String saveAdvisory(Patient patient){

        System.out.println("就诊信息" + patient);

        String s = speciaService.saveAdvisory(patient);

        return s;
    }
//展示出诊时间
    @RequestMapping("showTemplate")
    public TimeTable showTemplate(){

        TimeTable timeTable = speciaService.showTemplate();

        return timeTable;
    }
//    展示专家信息
    @RequestMapping("showExperts")
    public Experts showExperts(Integer id){

        System.out.println(id);

        Experts experts = speciaService.showExperts(id);

        return experts;
    }

    //展示专家列表
    @RequestMapping("showExpertsList")
    public ExpertsAndDepartment showExpertsList(Integer departmentId){

        System.out.println(departmentId);

        ExpertsAndDepartment expertsAndDepartment = speciaService.showExpertsList(departmentId);

        return expertsAndDepartment;
    }


}
