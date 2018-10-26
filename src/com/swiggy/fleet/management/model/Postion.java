package com.swiggy.fleet.management.model;

/**
 * Created by Aakarsh(aakarsh.gupta0@walmartlabs.com) on 13 Oct,2018.
 */
public enum Postion {
    CM("City Manager", 1), FM("Fleet Manager", 2), DE("Delivery Executives", 3);

    private final String description;

    private final int rank;

    private Postion(String description, int rank) {
        this.description = description;
        this.rank = rank;
    }

    public String getDescription() {
        return description;
    }

    public int getRank() {
        return rank;
    }
}
