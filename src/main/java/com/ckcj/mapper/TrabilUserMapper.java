package com.ckcj.mapper;


import com.ckcj.entity.Tbluser;
import org.apache.ibatis.annotations.Param;

import java.awt.*;

public interface TrabilUserMapper<TBLuser> {
    //1.增加用户（int）
    public int addTblUser(Tbluser tbluser);
    //2.删除用户(查找时返回布尔值boolean)
    public void delUser(String uid);
    //3.重置用户密码
    //传参用 注解 param
    public void udpateTblUser(String upwd, String userid);
    //4.查询所有的用户列表 根据用户模糊、余额范围 查询，分页。
    public List findTblUser(@Param(value = "uname") String uname,
                            @Param(value = "miny") long miny,
                            @Param(value = "maxy") long maxy,
                            @Param(value = "pageSize") int pageSize);
                            @Param(value = "pageNo")   int pageNo);
    //5.登录 根据用户和密码查询 Param

    public Tbluser loginUser(@Param(value = "uname") String uanme, @Param(value = "upwd") String upwd);
    //6.批量删除
    public int deleMTbluser(List<String>ulist);
    //7.关联查询，根据用户ID查询对象并且包含角色名称
    public TBLuser findUserRole(String userid);


}

