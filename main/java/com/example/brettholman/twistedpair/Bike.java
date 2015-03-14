package com.example.brettholman.twistedpair;


/**
 * Created by Brett Holman on 3/13/2015.
 */
public class Bike {
    private String brand;
    private int price;
    private String model;
    private String pictureLocation;

    Bike() {
        this.brand = "";
        this.model = "";
        this.price = 0;
        this.pictureLocation = "..";
    }

    Bike(String _brand, int _price, String _model, String _pictureLocation) {
        this.pictureLocation = _pictureLocation;
        this.price = _price;
        this.brand = _brand;
        this.model = _model;
    }

    // Getters

    /**
     *
     * @return brand
     */
    String getBrand() {
        return this.brand;
    }

    /**
     *
     * @return model
     */
    String getModel() {
        return this.model;
    }

    /**
     *
     * @return location
     */
    String getPictureLocation() {
        return this.pictureLocation;
    }

    /**
     *
     * @return price
     */
    int getPrice() {
        return this.price;
    }


}
