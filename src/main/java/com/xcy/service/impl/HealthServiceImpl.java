package com.xcy.service.impl;

import com.xcy.mapper.HealthMapper;
import com.xcy.pojo.Health;
import com.xcy.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class HealthServiceImpl implements HealthService {

    @Autowired
    HealthMapper healthMapper;
    @Override
    public Health showHealth(int id) {
        Health healthInfo = healthMapper.showHealth(id);
        return healthInfo;
    }

    @Override
    public Health showHeal() {

        return healthMapper.showHeal();
    }
}
