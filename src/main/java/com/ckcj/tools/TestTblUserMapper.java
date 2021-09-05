package com.ckcj.tools;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class TestTblUserMapper {
    SqlSession sqlSession=MybatisDbHelper.getSession();
    TblUserMapper tbluserMapper=sqlSession.getMapper(TblUserMapper.class);
    @Test
    public <TblUserMapper> void testAddTblUser(){MybatisDbHelper.SqlSession sqlsession=MybatisDbHelper.getSession();
        TblUserMapper tblUserMapper= ((SqlSession) sqlsession).getMapper(TblUserMapper.class);
        Tbluser tbluser=new Tbluser();
        tblUserMapper.addTblUser();
}

    private class TblUserMapper {
    }
}




