package com.example.jake.androidbasic;

import java.io.Serializable;

/**
 * Created by jake on 10/03/2018.
 */

public class UserAccount implements Serializable {
    private String userName;
    private String userJob;

    private boolean active;

    public UserAccount(String userName, String userJob) {
        this.userName = userName;
        this.userJob = userJob;
        this.active = true;
    }
    public UserAccount(String userName, String userJob, boolean active) {
        this.userName = userName;
        this.userJob = userJob;
        this.active = active;
    }
    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public String toString() {
        return this.userName + "(" + this.userJob + ")";
    }
}
