package com.example.user.nottspark.Model;

/**
 * Created by user on 27/2/2017.
 */

public class SpecificLocation {
    private int specLocID;
    private Building buildingID;
    private String row;
    private String description;

    public SpecificLocation() {
    }

    public SpecificLocation(int specLocID, Building buildingID, String row, String description) {
        this.specLocID = specLocID;
        this.buildingID = buildingID;
        this.row = row;
        this.description = description;
    }

    public int getSpecLocID() {
        return specLocID;
    }

    public void setSpecLocID(int specLocID) {
        this.specLocID = specLocID;
    }

    public Building getBuildingID() {
        return buildingID;
    }

    public void setBuildingID(Building buildingID) {
        this.buildingID = buildingID;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
