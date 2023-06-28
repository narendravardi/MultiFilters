package com.narendravardi.multifilters.models;

public class FilterParams {
    private String location;
    private double lowerPrice;
    private double upperPrice;
    private String propertyType;

    public FilterParams() {
    }

    public FilterParams(String location, double lowerPrice, double upperPrice) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLowerPrice() {
        return lowerPrice;
    }

    public void setLowerPrice(double lowerPrice) {
        this.lowerPrice = lowerPrice;
    }

    public double getUpperPrice() {
        return upperPrice;
    }

    public void setUpperPrice(double upperPrice) {
        this.upperPrice = upperPrice;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}
