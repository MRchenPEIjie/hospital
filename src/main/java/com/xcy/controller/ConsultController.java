package com.xcy.controller;

import com.xcy.pojo.ConsultAndThanks;
import com.xcy.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConsultController {

    @Autowired
    ConsultService consultService;


    @RequestMapping("/consult")
    @ResponseBody
    public String consult(ConsultAndThanks consultAndThanks){
        int result = consultService.insertConsult(consultAndThanks);

        if (result > 0) {
            return "success";
        } else {
            return "fail";
        }

    }

}
