package com.example.user.nottspark.Model;

/**
 * Created by user on 27/2/2017.
 */

public class Building {
    private int buildingID;
    private String buildingName;
    private String buildingColor;

    public Building() {
    }

    public Building(int buildingID, String buildingName, String buildingColor) {
        this.buildingID = buildingID;
        this.buildingName = buildingName;
        this.buildingColor = buildingColor;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(int buildingID) {
        this.buildingID = buildingID;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingColor() {
        return buildingColor;
    }

    public void setBuildingColor(String buildingColor) {
        this.buildingColor = buildingColor;
    }
}
