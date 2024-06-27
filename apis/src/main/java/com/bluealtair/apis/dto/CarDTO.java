package com.bluealtair.apis.dto;

import com.bluealtair.apis.data.enumeration.CarColor;
import com.bluealtair.apis.data.enumeration.CarEngineType;
import com.bluealtair.apis.data.enumeration.CarModel;

public class CarDTO {
    private String id;

    private String name;

    private CarModel model;

    private CarEngineType engine;

    private CarColor color;

    private String price;

    private String vin;

    private String image;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public CarEngineType getEngine() {
        return engine;
    }

    public void setEngine(CarEngineType engine) {
        this.engine = engine;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
