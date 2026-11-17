package com.hexagon.student_service.dto;

import org.springframework.data.annotation.Id;

public class school {
    @Id
    private int id;
    private String schoolName;
    private String location;
    private String principalName;

    public school(){

    }

    public school(String schoolName,String location,String principalName){
        this.schoolName=schoolName;
        this.location=location;
        this.principalName=principalName;
    }

    public String getSchoolName(){
        return schoolName;
    }

    public void setSchoolName(String schoolName){
        this.schoolName=schoolName;
    }

    public String getLocation(){
        return  location;
    }
    public void  setLocation(String location){
        this.location=location;
    }

    public String getPrincipalName(){
        return principalName;
    }

    public void setPrincipalName(String principalName){
        this.principalName=principalName;
    }
}
