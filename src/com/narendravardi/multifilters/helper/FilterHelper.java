package com.narendravardi.multifilters.helper;


import com.narendravardi.multifilters.models.FilterParams;
import com.narendravardi.multifilters.models.Property;
import com.narendravardi.multifilters.predicate.LocationFilter;
import com.narendravardi.multifilters.predicate.PriceFilter;
import com.narendravardi.multifilters.predicate.PropertyTypeFilter;

import java.util.function.Predicate;

public class FilterHelper {
    public static Predicate<Property> getFilters(FilterParams filterParams) {
        Predicate<Property> locationFilter = new LocationFilter(filterParams.getLocation());
        Predicate<Property> priceFilter = new PriceFilter(filterParams.getLowerPrice(), filterParams.getUpperPrice());
        Predicate<Property> propertyPredicate = new PropertyTypeFilter(filterParams.getPropertyType());

        // The resultant Filter will check that the property is true for all filters.
        Predicate<Property> compositeFilter = locationFilter.and(priceFilter).and(propertyPredicate);
        return compositeFilter;
    }
}
