package com.task5.builder;

import com.task5.country.*;
import com.task5.tour.Tour;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public class TourBuilder implements Builder{

    private Country country;
    private TourType tourType;
    private TransportType transportType;
    private String tourName;
    private int countDay;
    private float price;

    @Override
    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    @Override
    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    @Override
    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    @Override
    public void setCountDay(int countDay) {
        this.countDay = countDay;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    public Tour getResult() {
        return new Tour(country, tourType, transportType, tourName, countDay, price);
    }
}
