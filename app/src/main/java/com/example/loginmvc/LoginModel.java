package com.example.loginmvc;

/**
 * Created by محمد on 25/01/2016.
 */
public class LoginModel {
    private String username;
    private String password;


    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
