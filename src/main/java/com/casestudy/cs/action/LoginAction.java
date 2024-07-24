package com.casestudy.cs.action;

import com.opensymphony.xwork2.Action;


public class LoginAction implements Action {

    @Override
    public String execute() throws Exception {
        if("admin".equals(getName()) && "P@ssw0rd".equals(getPwd()))
            return "SUCCESS";
        else return "ERROR";
    }

    //Java Bean to hold the form parameters
    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
