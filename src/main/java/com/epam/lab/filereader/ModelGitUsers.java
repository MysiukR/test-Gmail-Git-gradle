package com.epam.lab.filereader;

public class ModelGitUsers {
    public String login;
    public String password;

    public ModelGitUsers(){
    }

    public String getPassword() {
        return password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}