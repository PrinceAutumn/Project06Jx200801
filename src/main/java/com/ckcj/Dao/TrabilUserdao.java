package com.ckcj.Dao;

;
import com.ckcj.entity.Tbluser;
import org.apache.ibatis.annotations.Param;

import java.awt.*;

public interface TrabilUserdao<upwd> {
    //1.增加用户
    public boolean addTbluser(Tbluser tbluser);

    //2.删除用户
    public boolean delTblUser(String uid);

    //3.重置用户密码
    public boolean udpateTblUser();

    boolean delTblUser(String upwd, String userid);

    // 传参用 注解param
    public boolean updateTblUser(String upwd, String userid);

    //4.查询所有用户列表 根据用户模糊查找分页
    public <Trabiluser> List findTrabiluser(String uname, int pageNo);

    //5.登录 根据用户密码查询
    public Tbluser loginUser(@Param(value = "uname") String uanme, @Param(value = "upwd") String upwd);

    public class Trabiluser {
    }
}
