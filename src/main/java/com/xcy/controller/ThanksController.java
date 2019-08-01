package com.xcy.controller;

import com.xcy.pojo.ConsultAndThanks;
import com.xcy.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThanksController {

    @Autowired
    ThanksService thanksService;

    @RequestMapping("/thanks")
    @ResponseBody
    public String thanks(ConsultAndThanks consultAndThanks){
        int result = thanksService.insertThanks(consultAndThanks);

        if (result > 0) {
            return "success";
        } else {
            return "fail";
        }
    }
}
