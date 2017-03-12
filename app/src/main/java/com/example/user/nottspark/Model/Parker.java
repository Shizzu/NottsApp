package com.example.user.nottspark.Model;

import java.security.Timestamp;

/**
 * Created by user on 27/2/2017.
 */

public class Parker {
    private int parkerID;
    private Timestamp startSearchingTime;
    private User userID;

    public Parker() {
    }

    public Parker(int parkerID, Timestamp startSearchingTime, User userID) {
        this.parkerID = parkerID;
        this.startSearchingTime = startSearchingTime;
        this.userID = userID;
    }

    public int getParkerID() {
        return parkerID;
    }

    public void setParkerID(int parkerID) {
        this.parkerID = parkerID;
    }

    public Timestamp getStartSearchingTime() {
        return startSearchingTime;
    }

    public void setStartSearchingTime(Timestamp startSearchingTime) {
        this.startSearchingTime = startSearchingTime;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }
}
