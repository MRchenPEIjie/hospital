package com.xcy.service.impl;

import com.xcy.mapper.ExpertsMapper;
import com.xcy.pojo.Experts;
import com.xcy.service.ExpertsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpertsServiceImpl implements ExpertsService {

    @Autowired
    ExpertsMapper expertsMapper;

    @Override
    public List<Experts> findAllExperts() {
        return expertsMapper.findAllExperts();
    }
}
