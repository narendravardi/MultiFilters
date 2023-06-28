package com.narendravardi.multifilters.predicate;


import com.narendravardi.multifilters.models.Property;

import java.util.function.Predicate;

public class PropertyTypeFilter implements Predicate<Property> {
    private String propertyType;

    public PropertyTypeFilter(String propertyType) {
        this.propertyType = propertyType;
    }

    @Override
    public boolean test(Property property) {
        return propertyType.equals(property.getPropertyType());
    }
}
