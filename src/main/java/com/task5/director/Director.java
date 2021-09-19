package com.task5.director;

import com.task5.builder.Builder;
import com.task5.country.Country;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class Director {
    public void constructTourExcursion(Builder builder) {
        builder.setCountDay(10);
        builder.setCountry(new Country("Russion", "Moscow"));
        builder.setPrice(365.23F);
        builder.setTourName("Excursion");
        builder.setTourType(TourType.EXCURSIONS);
        builder.setTransportType(TransportType.AIRLINE);
    }
}
