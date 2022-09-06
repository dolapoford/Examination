package com.example.examinationsystem.model;

import java.io.Serializable;

public class Student implements Serializable {
    private String id;
    private String fullName;
    private String course;
    private String email;

    public Student(String id,String fullName,String course,String email){
        this.id=id;
        this.fullName=fullName;
        this.course=course;
        this.email=email;

    }

    public Student() {
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;

    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
}


