package com.ckcj.entity;

public class Tbluser {
    private long userid;
    private long rid;
    private String uname;
    private String upwd;
    private double money;
    private String phone;

    private Tblrole tblrole;
    private long usersid;

    public Tblrole getTblrole() {
        return tblrole;
    }

    public void setTblrole(){
        this.tblrole=tblrole;
    }
    
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {

         this.usersid = userid;
    }

    public long getRid() {

        return rid;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

