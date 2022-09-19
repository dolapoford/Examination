package com.example.examinationsystem.model;

import java.io.Serializable;

public class ExamRequest implements Serializable {
    private Integer examId;
    private CourseRequest courseRequest;
    private Long duration;

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
