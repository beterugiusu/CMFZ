package com.wu.cmfz.entity;

import java.io.Serializable;

/**
 * Created by wu on 2018/7/4.
 */
public class Manager implements Serializable{
    private Integer mgrId;
    
    private String mgrName;
    private String mgrPwd;
    private String salt;
    private String mgrStatus;

    public Integer getMgrId() {
        return mgrId;
    }

    public void setMgrId(Integer mgrId) {
        this.mgrId = mgrId;
    }

    public String getMgrName() {
        return mgrName;
    }

    public void setMgrName(String mgrName) {
        this.mgrName = mgrName;
    }

    public String getMgrPwd() {
        return mgrPwd;
    }

    public void setMgrPwd(String mgrPwd) {
        this.mgrPwd = mgrPwd;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getMgrStatus() {
        return mgrStatus;
    }

    public void setMgrStatus(String mgrStatus) {
        this.mgrStatus = mgrStatus;
    }

    public Manager(Integer mgrId, String mgrName, String mgrPwd, String salt, String mgrStatus) {
        this.mgrId = mgrId;
        this.mgrName = mgrName;
        this.mgrPwd = mgrPwd;
        this.salt = salt;
        this.mgrStatus = mgrStatus;
    }

    public Manager() {
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mgrId=" + mgrId +
                ", mgrName='" + mgrName + '\'' +
                ", mgrPwd='" + mgrPwd + '\'' +
                ", salt='" + salt + '\'' +
                ", mgrStatus='" + mgrStatus + '\'' +
                '}';
    }
}
