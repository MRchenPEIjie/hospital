package com.xcy.service.impl;

import com.xcy.mapper.ExpertsMsgMapper;
import com.xcy.pojo.Experts;
import com.xcy.service.ExpertsMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertsMsgServiceImpl implements ExpertsMsgService {

    @Autowired
    ExpertsMsgMapper expertsMsgMapper;
    @Override
    public Experts expertsMsg(int id) {
        return expertsMsgMapper.expertsMsg(id);
    }
}
