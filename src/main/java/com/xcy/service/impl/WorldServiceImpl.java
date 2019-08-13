package com.xcy.service.impl;

import com.xcy.mapper.ReaderMapper;
import com.xcy.pojo.World;
import com.xcy.service.WorldService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class WorldServiceImpl implements WorldService {
    @Autowired
    private ReaderMapper readerMapper;



    @Override
    public List<World> getTitle() {
       List<World> list = readerMapper.getTitle();
                return list;


    }

    @Override
    public List<String> getText(int id) {
       String str = readerMapper.getText(id);
       String[] text = str.split("@@");
        List<String> textList = new ArrayList<>(text.length);
        Collections.addAll(textList,text);
        return textList;
    }

    @Override
    public World getWorldById(int id) {
        World world = readerMapper.getWorldById(id);
        return world;

    }


}
