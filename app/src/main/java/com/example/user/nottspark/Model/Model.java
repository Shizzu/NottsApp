package com.example.user.nottspark.Model;

/**
 * Created by user on 27/2/2017.
 */

public class Model {
    private int modelID;
    private String modelName;
    private Brand brand;

    public Model() {
    }

    public Model(int modelID, String modelName, Brand brand) {
        this.modelID = modelID;
        this.modelName = modelName;
        this.brand = brand;
    }

    public int getModelID() {
        return modelID;
    }

    public void setModelID(int modelID) {
        this.modelID = modelID;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
