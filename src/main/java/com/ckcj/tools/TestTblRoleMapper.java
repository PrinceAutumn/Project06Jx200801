package com.ckcj.tools;

import org.junit.Test;

import java.awt.*;

public class TestTblRoleMapper<Sqlession, TblRoleMapper, Sqlsession, TblUserMapper> {
    com.ckcj.Dao.MybatisDbHelper.SqlSession sqlsession=MybatisDbHelper.getSession();
    TblRoleMapper tblRoleMapper=sqlsession.(TblUserMapper.class);
    @Test
    public <Tblrole> void testFindRoleUsers(){
        Object rid = null;
        Tblrole tblrole= TblRoleMapper.registerNatives(rid"1");
        List tbluserList=tblrole.getTblusers();
        System.out.println();
    }

    private class SqlSession {
    }
}