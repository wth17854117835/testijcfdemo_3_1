package com.sitech.ijcf.demo.dto;

import org.hibernate.validator.constraints.Length;

/**
 * @author wangth_oup
 * @date 2019-05-13 14:46
 **/
public class User {

    @Length(min = 1,max = 10)
    private String name;
    private String age;
    private String pwd;
    private String nick;

    private Cust cust;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Cust getCust() {
        return cust;
    }

    public void setCust(Cust cust) {
        this.cust = cust;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", pwd='" + pwd + '\'' +
                ", nick='" + nick + '\'' +
                ", cust=" + cust +
                '}';
    }
}
