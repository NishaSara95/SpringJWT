package com.springboot.springbootJWT.model;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.Serializable;


public class JwtRequest implements Serializable {


    public static final long serialVersionUID=255018516562042358L;

    private String userName;
    private  String password;

    // Need default constructor for Json Parsing
    public JwtRequest(){

    }
    public JwtRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
