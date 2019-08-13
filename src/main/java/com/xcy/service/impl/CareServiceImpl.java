package com.xcy.service.impl;

import com.xcy.mapper.CareMapper;
import com.xcy.pojo.Care;
import com.xcy.service.CareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CareServiceImpl implements CareService {

    @Autowired
    CareMapper careMapper;

    @Override
    public Care careWorldInfo(int id) {

        Care careWorldInfo = careMapper.careWorldInfo(id);
        return careWorldInfo;
    }

    @Override
    public Care careWorld() {

       return careMapper.careWorld();
    }
}
