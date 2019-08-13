package com.xcy.mapper;

import com.xcy.pojo.World;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReaderMapper {
    void getReader(World world);
    List<World> getTitle();
    String getText(int id);
    World getWorldById(int id);

}
