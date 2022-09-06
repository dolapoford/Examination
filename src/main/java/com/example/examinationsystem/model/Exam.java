package com.example.examinationsystem.model;

import java.io.Serializable;

public class Exam implements Serializable {
    private String examId;
    private String course;
    private String duration;

    public Exam(String examId, String course, String duration) {
        this.examId = examId;
        this.course = course;
        this.duration = duration;
    }
    public Exam(){}


    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
