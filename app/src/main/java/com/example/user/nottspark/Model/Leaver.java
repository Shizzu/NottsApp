package com.example.user.nottspark.Model;

import java.security.Timestamp;

/**
 * Created by user on 27/2/2017.
 */

public class Leaver {
    private int leaverID;
    private String leavingTime;
    private User userID;
    private SpecificLocation location;
    private String status;

    public Leaver() {
    }

    public Leaver(int leaverID, String leavingTime, User userID, SpecificLocation location, String status) {
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

    public String getLeavingTime() {
        return leavingTime;
    }

    public void setLeavingTime(String leavingTime) {
        this.leavingTime = leavingTime;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public SpecificLocation getLocation() {
        return location;
    }

    public void setLocation(SpecificLocation location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
