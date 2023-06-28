package com.narendravardi.multifilters.predicate;


import com.narendravardi.multifilters.models.Property;

import java.util.function.Predicate;

public class LocationFilter implements Predicate<Property> {
    private String location;
    public LocationFilter(String location) {
        this.location = location;
    }
    @Override
    public boolean test(Property property) {
        return property.getLocation().equals(location);
    }
}
