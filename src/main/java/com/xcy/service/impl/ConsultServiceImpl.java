package com.xcy.service.impl;

import com.xcy.mapper.ConsultMapper;
import com.xcy.pojo.ConsultAndThanks;
import com.xcy.service.ConsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultServiceImpl implements ConsultService {

    @Autowired
    ConsultMapper consultMapper;

    @Override
    public int insertConsult(ConsultAndThanks consultAndThanks) {

        return consultMapper.insertConsult(consultAndThanks);
    }
}
