package com.xcy.service;

import com.xcy.pojo.Department;
import com.xcy.pojo.Patient;

public interface SpeciaService {

    public Department showSpeciaInfo(Integer id);

    public  String saveAdvisory(Patient patient);

}
