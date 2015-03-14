package com.example.brettholman.twistedpair;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

/**
 * Created by Brett Holman on 3/14/2015.
 */
public class ListOfBikes{
    private ArrayList<Bike> listOfBikes;
    private ArrayList<String> listOfDummyNames;

    public ListOfBikes() {
        this.listOfDummyNames = new ArrayList<String>();
        this.listOfBikes = new ArrayList<Bike>();
        this.setUp();
    }

    public void setUp() {
        listOfBikes.add(new Bike("Huffy", 239.99, "28 inch Ladies Main", BikeColor.Red));
        listOfBikes.add(new Bike("Cycle Force", 269.99, "Cross Cuntry 762M Comfort", BikeColor.Black));
        listOfBikes.add(new Bike("Forge", 289.99, "Forge Mens Vero LS 19", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Ladies Main Street", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Mens Main Street", BikeColor.Blue));
        listOfBikes.add(new Bike("Forge", 299.99, "Forge Mens Saranac 19", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 239.99, "28 inch Ladies Main", BikeColor.Red));
        listOfBikes.add(new Bike("Cycle Force", 269.99, "Cross Cuntry 762M Comfort", BikeColor.Black));
        listOfBikes.add(new Bike("Forge", 289.99, "Forge Mens Vero LS 19", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Ladies Main Street", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Mens Main Street", BikeColor.Blue));
        listOfBikes.add(new Bike("Forge", 299.99, "Forge Mens Saranac 19", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 239.99, "28 inch Ladies Main", BikeColor.Red));
        listOfBikes.add(new Bike("Cycle Force", 269.99, "Cross Cuntry 762M Comfort", BikeColor.Black));
        listOfBikes.add(new Bike("Forge", 289.99, "Forge Mens Vero LS 19", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Ladies Main Street", BikeColor.Red));
        listOfBikes.add(new Bike("Huffy", 279.99, "28 Mens Main Street", BikeColor.Blue));
        listOfBikes.add(new Bike("Forge", 299.99, "Forge Mens Saranac 19", BikeColor.Red));

        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Cycle Force");
        listOfDummyNames.add("Forge");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Forge");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Cycle Force");
        listOfDummyNames.add("Forge");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Forge");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Cycle Force");
        listOfDummyNames.add("Forge");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Huffy");
        listOfDummyNames.add("Forge");

    }

    public ArrayList<String> getListOfNames() {
        return this.listOfDummyNames;
    }

    public ArrayList<Bike> getListOfBikes() {
        return this.listOfBikes;
    }

    public void Add(Bike b) {
        this.listOfBikes.add(b);
        this.listOfDummyNames.add(b.getBrand());
    }

    public Bike getAtIndex(int index) {
        return this.listOfBikes.get(index);
    }
}
