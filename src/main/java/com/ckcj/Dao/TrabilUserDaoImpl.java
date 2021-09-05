package com.ckcj.Dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.mapper.MybatisDbHelper;
import com.ckcj.tools.TestTblUserDao;
import jdk.nashorn.internal.objects.NativeError;
import org.apache.ibatis.session.SqlSession;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TrabilUserDaoImpl implements TrabilUserDao {

    @Override
    public boolean addTbluser(Tbluser tbluser, MybatisDbHelper MybatisDbhelper) {
        boolean flag = false;
        try {
            //1.得到链接
            SqlSession sqlSession =  MybatisDbhelper.getSession();
            //2.SQL
            Map map=new HashMap();
            Object id;
            map.put("upwd",id);
            Object userid;
            map.put("userid",userid);
            String s;
            int num = sqlSession.insert(s:"addTblUser", tbluser);
            //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }
    @Override
    public boolean delTblUser( String uid) {
            try {
                //1.得到链接
                SqlSession sqlSession = (SqlSession) com.ckcj.Dao.MybatisDbHelper.getSession();
                //2.SQL
                int num = SqlSession.insert(S:Object tbluser);
                //3.提交
                sqlSession.commit();
                System.out.println(num);
                if(num>0){
                    boolean flag = true;
            }
       }catch (Exception.e){
                boolean flag = false;
                NativeError e;}
        NativeError e;
        NativeError.printStackTrace();
  }
}














