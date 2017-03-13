package com.example.user.nottspark.Model;

/**
 * Created by user on 27/2/2017.
 */

public class Leaver {
    private int leaverID;
    private String leavingDate;
    private String leavingTime;
    private User userID;
    private SpecificLocation location;
    private String status;

    public Leaver() {
    }

    public Leaver(int leaverID, String leavingDate, String leavingTime, User userID, SpecificLocation location, String status) {
        this.leaverID = leaverID;
        this.leavingDate = leavingDate;
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

    public String getLeavingDate() {
        return leavingDate;
    }

    public void setLeavingDate(String leavingDate) {
        this.leavingDate = leavingDate;
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
