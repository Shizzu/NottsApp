package com.example.user.nottspark.Model;

/**
 * Created by user on 27/2/2017.
 */

public class SpecificLocation {
    private int specLocID;
    private String buildingName;
    private String buildingColor;
    private String description;
    private String fileURL;

    public SpecificLocation() {
    }

    public SpecificLocation(int specLocID, String buildingName, String buildingColor, String description, String fileURL) {
        this.specLocID = specLocID;
        this.buildingName = buildingName;
        this.buildingColor = buildingColor;
        this.description = description;
        this.fileURL = fileURL;
    }

    public String getFileURL() {
        return fileURL;
    }

    public void setFileURL(String fileURL) {
        this.fileURL = fileURL;
    }

    public int getSpecLocID() {
        return specLocID;
    }

    public void setSpecLocID(int specLocID) {
        this.specLocID = specLocID;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
