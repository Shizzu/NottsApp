package com.example.user.nottspark.Model;

import com.example.user.nottspark.Database.Archives.Parker;

import java.security.Timestamp;

/**
 * Created by user on 27/2/2017.
 */

public class Transaction {
    private int transID;
    private Parker parkerID;
    private Leaver leaverID;
    private int exchangeStatus;
    private Timestamp exchangeTime;

    public Transaction() {
    }

    public Transaction(int transID, Parker parkerID, Leaver leaberID, int exchangeStatus, Timestamp exchangeTime) {
        this.transID = transID;
        this.parkerID = parkerID;
        this.leaverID = leaberID;
        this.exchangeStatus = exchangeStatus;
        this.exchangeTime = exchangeTime;
    }

    public int getTransID() {
        return transID;
    }

    public void setTransID(int transID) {
        this.transID = transID;
    }

    public Parker getParkerID() {
        return parkerID;
    }

    public void setParkerID(Parker parkerID) {
        this.parkerID = parkerID;
    }

    public Leaver getLeaberID() {
        return leaverID;
    }

    public void setLeaberID(Leaver leaberID) {
        this.leaverID = leaberID;
    }

    public int getExchangeStatus() {
        return exchangeStatus;
    }

    public void setExchangeStatus(int exchangeStatus) {
        this.exchangeStatus = exchangeStatus;
    }

    public Timestamp getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Timestamp exchangeTime) {
        this.exchangeTime = exchangeTime;
    }
}
