package com.xcy.pojo;


public class Department {

    //id
    private  Integer id;

    //名字
    private String name;

    //简介
    private String briefIntroduction;

    //特色
    private String characteristic;

    //专家
    private String expert;

    //出诊时间
    private String time;

    public Department() {
    }

    public Department(Integer id, String briefIntroduction, String characteristic, String expert, String time, String name) {
        this.id = id;
        this.briefIntroduction = briefIntroduction;
        this.characteristic = characteristic;
        this.expert = expert;
        this.time = time;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public String getExpert() {
        return expert;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", briefIntroduction='" + briefIntroduction + '\'' +
                ", characteristic='" + characteristic + '\'' +
                ", expert='" + expert + '\'' +
                ", time='" + time + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
