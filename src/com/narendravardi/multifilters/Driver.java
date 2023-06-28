package com.narendravardi.multifilters;

import com.narendravardi.multifilters.helper.FilterHelper;
import com.narendravardi.multifilters.models.FilterParams;
import com.narendravardi.multifilters.models.Property;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Driver {
    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();
        properties.add(new Property("blr", 2000, "one_bhk", "akhil", false));
        properties.add(new Property("blr", 2000, "two_bhk", "akhil", false));
        properties.add(new Property("kol", 3000, "two_bhk", "roy", false));
        properties.add(new Property("hyd", 1000, "two_bhk", "rahul", false));
        properties.add(new Property("blr", 4000, "two_bhk", "rahul", false));

        FilterParams filterParams = new FilterParams();
        filterParams.setLocation("blr");
        filterParams.setLowerPrice(1800);
        filterParams.setUpperPrice(2200);
        filterParams.setPropertyType("two_bhk");

        Predicate<Property> p = FilterHelper.getFilters(filterParams);

        // There is no need to use stream() API here. But I am using it since Functional Interface and stream()
        // were introduced at the same time.

        // The below stream API can be replaced with the following code as well!
        // List<Property> filteredProperties = new ArrayList<>();
        // for (Property p: properties) {
        //     if (FilterHelper.getFilters(filterParams).test(p)) {
        //         filteredProperties.add(p);
        //     }
        // }
        List<Property> filteredProperties = properties
                .stream()
                .filter(FilterHelper.getFilters(filterParams))
                .collect(Collectors.toList());

        // outputs: [Property{location='blr', price=2000.0, propertyType='two_bhk', ownerId='akhil', isSoldOut=false}]
        System.out.println(Arrays.toString(filteredProperties.toArray()));
    }
}
