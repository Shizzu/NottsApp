package com.example.user.nottspark.Model;

import java.security.Timestamp;

/**
 * Created by user on 27/2/2017.
 */

public class Leaver {
    private int leaverID;
    /*
    private Timestamp leavingTime;
    private User userID;
    private SpecificLocation location;
    */
    private Timestamp leavingTime;
    private int userID;
    private String location;
    private String status;

    public Leaver() {
    }

    public Leaver(int leaverID, Timestamp leavingTime, int userID, String location, String status) {
        this.leaverID = leaverID;
        this.leavingTime = leavingTime;
        this.userID = userID;
        this.location = location;
        this.status = status;
    }

    public int getLeaverID() {
        return leaverID;
    }

    public void setLeaverID(int leaverID) {
        this.leaverID = leaverID;
    }

    public Timestamp getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(Timestamp leavingTime) {
        this.leavingTime = leavingTime;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
