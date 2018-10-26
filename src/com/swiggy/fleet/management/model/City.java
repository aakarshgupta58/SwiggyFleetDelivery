package com.swiggy.fleet.management.model;

/**
 * Created by Aakarsh(aakarsh.gupta0@walmartlabs.com) on 13 Oct,2018.
 */
public class City {
    String name;
    int zip;

    public City(String name, int zip) {
        this.name = name;
        this.zip = zip;
    }

    public String getName() {
        return name;
    }

    public int getPincode() {
        return zip;
    }

}
