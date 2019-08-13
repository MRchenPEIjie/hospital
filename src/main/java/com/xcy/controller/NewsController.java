package com.xcy.controller;

import com.xcy.pojo.World;
import com.xcy.service.WorldService;
import com.xcy.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class NewsController {
    @Autowired
    WorldService worldService;

    @ResponseBody
    @RequestMapping("/getTitle")
    public List<World> getTitle(){

     List<World> list=worldService.getTitle();

        return list;
    }
    @ResponseBody
    @RequestMapping( "/getText/{id}")
    public String getText(@PathVariable Integer id){

        List<String> list=worldService.getText(id);
        String JsonData = JsonUtils.objectToJson(list);

        return JsonData;
    }
    @ResponseBody
    @RequestMapping( "/getWorld/{id}")
    public String getWorld(@PathVariable Integer id){

        World world=worldService.getWorldById(id);
        String JsonData = JsonUtils.objectToJson(world);

        return JsonData;
    }



}
