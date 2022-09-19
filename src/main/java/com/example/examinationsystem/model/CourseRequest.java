package com.example.examinationsystem.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class CourseRequest implements Serializable {
    private Integer courseId;
    private Integer courseCode;
    private String courseName;

    private LocalDateTime dateCreated;
    private LocalDateTime lastModified;

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(Integer courseCode) {
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

    private String qnsPerExam;

}