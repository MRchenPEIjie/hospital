package com.xcy.service.impl;

import com.xcy.mapper.BriefMapper;
import com.xcy.pojo.Brief;
import com.xcy.service.BriefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BriefServiceImpl implements BriefService {

    @Autowired
    BriefMapper briefMapper;

    @Override
    public String selectBrief(Brief brief) {

        return briefMapper.selectBrief(brief);
    }
}
