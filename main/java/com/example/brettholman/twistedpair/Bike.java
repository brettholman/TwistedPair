package com.example.brettholman.twistedpair;


/**
 * Created by Brett Holman on 3/13/2015.
 * This is the container for each of the bike's data.
 * You'll notice that there is no storage of the item's "Description"
 * I decided to factor that out of each instance, and store it in the Strings.xml file.
 * If this was to be fully implemented, I would add a way to store a description.
 *
 */

public class Bike {
    private String brand;
    private double price;
    private String model;
    private BikeColor color;

    public Bike(String _brand, double _price, String _model, BikeColor color) {
        this.color = color;
        this.price = _price;
        this.brand = _brand;
        this.model = _model;
    }

    // Getters

    /**
     *
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     *
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     *
     * @return location
     */
    public BikeColor getColor() {
        return this.color;
    }

    /**
     *
     * @return price
     */
    public double getPrice() {
        return this.price;
    }
}
