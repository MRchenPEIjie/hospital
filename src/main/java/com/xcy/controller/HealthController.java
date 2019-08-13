package com.xcy.controller;


import com.xcy.pojo.Health;
import com.xcy.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @Autowired
    HealthService healthService;


    @RequestMapping("/heal")
    public Health show( ){
        Health healthInfo = healthService.showHeal();
        return healthInfo;
    }

    @RequestMapping("/health")
    public Health showHealth(int id ){
        Health healthInfo = healthService.showHealth(id);
        return healthInfo;
    }
}
