package com.xcy.service;

import com.xcy.pojo.*;

public interface SpeciaService {

    public Department showSpeciaInfo(Integer id);

    public  String saveAdvisory(Patient patient);

    public TimeTable showTemplate();

    public Experts showExperts(Integer id);

    ExpertsAndDepartment showExpertsList(Integer departmentId);

}
