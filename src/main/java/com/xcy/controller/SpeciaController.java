package com.xcy.controller;


import com.xcy.pojo.Department;
import com.xcy.pojo.Patient;
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

    @RequestMapping("saveAdvisory")
    public String saveAdvisory(Patient patient){


        String s = speciaService.saveAdvisory(patient);




        return s;
    }
//
    @RequestMapping("showTemplate")
    public String showTemplate(){



        return "";
    }

}
