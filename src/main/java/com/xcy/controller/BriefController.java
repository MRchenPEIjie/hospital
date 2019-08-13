package com.xcy.controller;


import com.xcy.pojo.Brief;
import com.xcy.service.BriefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BriefController {

    @Autowired
    BriefService briefService;

    @RequestMapping("/brief")
    @ResponseBody
    public String selectBrief(Brief brief){

        return briefService.selectBrief(brief);

    }
}
