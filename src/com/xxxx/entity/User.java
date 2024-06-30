package com.xxxx.entity;

/**
 * User实体类
 */
public class User {
    private String username;//用户姓名
    private String userpassword;//用户密码
    private int age;
    private String job;
    private String tel;
    private String email;

    public User(String username, String userpassword, int age, String job, String tel, String email) {
        this.username = username;
        this.userpassword = userpassword;
        this.age = age;
        this.job = job;
        this.tel = tel;
        this.email = email;
    }

    //alt和insert快捷键
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
