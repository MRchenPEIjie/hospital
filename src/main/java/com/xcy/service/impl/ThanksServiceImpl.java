package com.xcy.service.impl;

import com.xcy.mapper.ThanksMapper;
import com.xcy.pojo.ConsultAndThanks;
import com.xcy.service.ThanksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThanksServiceImpl implements ThanksService {

    @Autowired
    ThanksMapper thanksMapper;

    @Override
    public int insertThanks(ConsultAndThanks consultAndThanks) {
        return thanksMapper.insertThanks(consultAndThanks);
    }
}
