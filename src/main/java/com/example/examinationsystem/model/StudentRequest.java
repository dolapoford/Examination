package com.example.examinationsystem.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class StudentRequest implements Serializable {
    private Integer id;
    private String fullName;
    private String email;
    private String username;
    private String password;
    private LocalDateTime dateCreated;
    private LocalDateTime lastModified;
    private String status;
    private ArrayList<String> course;

//    public StudentRequest(Integer id, String fullName, String email, String username, String password, LocalDateTime dateCreated, LocalDateTime lastModified, String status, ArrayList<String> course) {
//        this.id = id;
//        this.fullName = fullName;
//        this.email = email;
//        this.username = username;
//        this.password = password;
//        this.dateCreated = dateCreated;
//        this.lastModified = lastModified;
//        this.status = status;
//        this.course = course;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<String> getCourse() {
        return course;
    }

    public void setCourse(ArrayList<String> course) {
        this.course = course;
    }
}


