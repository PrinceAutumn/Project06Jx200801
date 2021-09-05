package com.ckcj.service.impl;

public class UerService<UserDao> {

    //创建UserDao类型属性，生成set方法
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("service add...............");
        //调用dao方法

    }
}

//dao类
class UserDaoImpl implements UserDao {

   
    public void update() {
        System.out.println("dao update...........");
    }
}

