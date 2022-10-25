package com.example.examinationsystem.model;

import javafx.scene.control.Button;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ExamRequest implements Serializable {
    private Integer examId;
    private CourseRequest courseRequest;
    private Long duration;
    private Button btn;
    private LocalDateTime dateCreated;
    private LocalDateTime lastModified;




    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

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

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }

    public CourseRequest getCourse() {
        return courseRequest;
    }

    public void setCourse(CourseRequest courseRequest) {
        this.courseRequest = courseRequest;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}
