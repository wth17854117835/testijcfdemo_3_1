package com.sitech.ijcf.demo.dto;

/**
 * @author wangth_oup
 * @date 2019-05-13 14:47
 **/
public class Cust {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
