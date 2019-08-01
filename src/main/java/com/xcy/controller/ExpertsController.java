package com.xcy.controller;

import com.xcy.pojo.Experts;
import com.xcy.service.ExpertsService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class ExpertsController {

    @Autowired
    ExpertsService expertsService;

    @RequestMapping("/showlist")
    @ResponseBody
    public String expertList(){

        List<Experts> list = expertsService.findAllExperts();

        String json = JsonUtils.objectToJson(list);

        return json;
    }
}
