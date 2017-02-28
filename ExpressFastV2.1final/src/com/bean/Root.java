package com.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 创建者 li
 * 时间 2017/2/28.
 * 描述：
 */

public class Root implements Serializable {
    private String message;

    private String nu;

    private String ischeck;

    private String condition;

    private String com;

    private String status;

    private String state;

    private List<Data> data ;
    
    private static final long serialVerisionUID = 2L;
    
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setNu(String nu){
        this.nu = nu;
    }
    public String getNu(){
        return this.nu;
    }
    public void setIscheck(String ischeck){
        this.ischeck = ischeck;
    }
    public String getIscheck(){
        return this.ischeck;
    }
    public void setCondition(String condition){
        this.condition = condition;
    }
    public String getCondition(){
        return this.condition;
    }
    public void setCom(String com){
        this.com = com;
    }
    public String getCom(){
        return this.com;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }

}
