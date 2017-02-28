package com.bean;

import java.io.Serializable;


public class Data  implements Serializable{
    private String time;

    private String ftime;

    private String context;

    private String location;
    
    private static final long serialVerisionUID = 1L;

    public void setTime(String time){
        this.time = time;
    }
    public String getTime(){
        return this.time;
    }
    public void setFtime(String ftime){
        this.ftime = ftime;
    }
    public String getFtime(){
        return this.ftime;
    }
    public void setContext(String context){
        this.context = context;
    }
    public String getContext(){
        return this.context;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public String getLocation(){
        return this.location;
    }

}