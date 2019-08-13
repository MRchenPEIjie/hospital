package com.xcy.service;

import com.xcy.pojo.World;

import java.util.List;

public interface WorldService {

    List<World> getTitle();
    List<String> getText(int id);
    World getWorldById(int id);

}
