package com.example.examinationsystem.model;

import java.io.Serializable;

public class Course implements Serializable {
    private String courseId;
    private String courseCode;
    private String courseName;
    private String qnsPerExam;

    public Course( String courseId,String courseCode,String courseName,String qnsPerExam){
        this.courseId=courseId;
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.qnsPerExam=qnsPerExam;
    }

    public Course() {

    }

    public void setCourseId(String courseId){
        this.courseId=courseId;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getQnsPerExam() {
        return qnsPerExam;
    }

    public void setQnsPerExam(String qnsPerExam) {
        this.qnsPerExam = qnsPerExam;
    }
}
