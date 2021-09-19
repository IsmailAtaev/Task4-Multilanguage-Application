package com.task5;

import com.task5.builder.TourBuilder;
import com.task5.director.Director;
import com.task5.tour.Tour;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        TourBuilder tourBuilder = new TourBuilder();

        director.constructTourExcursion(tourBuilder);

        Tour tour = tourBuilder.getResult();
        System.out.println(tour.toString());

    }
}
