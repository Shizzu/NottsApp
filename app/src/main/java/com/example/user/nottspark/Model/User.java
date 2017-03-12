package com.example.user.nottspark.Model;

import java.security.Timestamp;
import java.util.ArrayList;

// Account (Credentials) and Profile (Account Holder's Information) Combined
public class User {
    public static int ttlUser;
    private int userID;
    private String userUsername;
    private String userName;
    private String userContactNum;
    private String userEmail;
    private ArrayList<Car> carList;
    private Timestamp registerDate;
    private String userAccountType;
    private String userPassword;

    public User() {
        ttlUser++;
    }

    public User(int userID, String userUsername, String userName, String userContactNum, String userEmail, String userAccountType, String userPassword) {
        ttlUser++;
        this.userID = userID;
        this.userUsername = userUsername;
        this.userName = userName;
        this.userContactNum = userContactNum;
        this.userEmail = userEmail;
        this.userAccountType = userAccountType;
        this.userPassword = userPassword;
    }

    public static int getTtlUser() {
        return ttlUser;
    }

    public static void setTtlUser(int ttlUser) {
        User.ttlUser = ttlUser;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserContactNum() {
        return userContactNum;
    }

    public void setUserContactNum(String userContactNum) {
        this.userContactNum = userContactNum;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAccountType() {
        return userAccountType;
    }

    public void setUserAccountType(String userAccountType) {
        this.userAccountType = userAccountType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
