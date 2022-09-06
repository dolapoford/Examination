package com.example.examinationsystem.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Signup implements Serializable {
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
    private ArrayList <String> course;

    public Signup(String userName, String email, String password, String confirmPassword, ArrayList<String> course) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.course = course;
    }

    public Signup() {
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setCourse(ArrayList<String> course) {
        this.course = course;
    }

    public ArrayList<String> getCourse() {
        return course;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
