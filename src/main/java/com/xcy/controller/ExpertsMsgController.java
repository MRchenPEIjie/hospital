package com.xcy.controller;

import com.xcy.pojo.Experts;
import com.xcy.service.ExpertsMsgService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExpertsMsgController {

    @Autowired
    ExpertsMsgService expertsMsgService;

    @RequestMapping("/expertsMsg")
    @ResponseBody
    public String expertsMsg(int id) {
        Experts experts = expertsMsgService.expertsMsg(id);
        String json = JsonUtils.objectToJson(experts);
        return "json";
    }

}
