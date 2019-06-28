package com.app;

public class UserLogIn {
    private String email;
    private String password;
    JJWT jjwt = new JJWT();

    public UserLogIn(){

    }

    public UserLogIn(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return jjwt.generate(password);
    }

    public void setPassword(String password) {
        this.password = password;
    }




}