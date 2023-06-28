package com.narendravardi.multifilters.models;


public class Property {
    private String location;
    private double price;
    private String propertyType;
    private String ownerId;
    private boolean isSoldOut;


    public Property(String location, double price, String propertyType, String ownerId, boolean isSoldOut) {
        this.location = location;
        this.price = price;
        this.propertyType = propertyType;
        this.ownerId = ownerId;
        this.isSoldOut = isSoldOut;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        propertyType = propertyType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public boolean isSoldOut() {
        return isSoldOut;
    }

    public void setSoldOut(boolean soldOut) {
        isSoldOut = soldOut;
    }

    @Override
    public String toString() {
        return "Property{" +
                "location='" + location + '\'' +
                ", price=" + price +
                ", propertyType='" + propertyType + '\'' +
                ", ownerId='" + ownerId + '\'' +
                ", isSoldOut=" + isSoldOut +
                '}';
    }
}
