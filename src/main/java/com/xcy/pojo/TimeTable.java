package com.xcy.pojo;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;

/**
 * @program: hospital
 * @description:
 * @author: ZZL
 * @create: 2019-08-13 15:32
 **/

@Data
public class TimeTable {
    private int id;
    private String name;
    private String time;



}
