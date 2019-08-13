package com.xcy.controller;


import com.xcy.pojo.Care;

import com.xcy.service.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CareController {

    @Autowired
    CareService careService;


    @RequestMapping("/care")
    public Care show(){
        Care careWorldInfo = careService.careWorld();
        return careWorldInfo;
    }

    @RequestMapping("/careInfo")
    public Care showCare(int id){
        Care careWorldInfo = careService.careWorldInfo(id);
        return careWorldInfo;
    }
}
