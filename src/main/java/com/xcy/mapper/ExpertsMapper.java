package com.xcy.mapper;

import com.xcy.pojo.Experts;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ExpertsMapper {
    List<Experts> findAllExperts();
}
