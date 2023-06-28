package com.narendravardi.multifilters.predicate;



import com.narendravardi.multifilters.models.Property;

import java.util.function.Predicate;

public class PriceFilter implements Predicate<Property> {
    private double lowerPrice;
    private double upperPrice;

    public PriceFilter(double lowerPrice, double upperPrice) {
        this.lowerPrice = lowerPrice;
        this.upperPrice = upperPrice;
    }

    @Override
    public boolean test(Property property) {
        // AB Testing logic can be added here.
        return property.getPrice() >= lowerPrice && property.getPrice() <= upperPrice;
    }
}
