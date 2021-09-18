package com.task5.builder;

import com.task5.country.*;
import com.task5.tourType.TourType;
import com.task5.transportType.TransportType;

public interface Builder {
    void setCountry(Country country);

    void setTourType(TourType tourType);

    void setTransportType(TransportType transportType);

    void setTourName(String tourName);

    void setCountDay(int countDay);

    void setPrice(float price);
}