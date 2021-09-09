package com.task3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Ataev Ismayyl
 * @implNote Serializable
 * @see java.io.Serializable
 * Region = Область
 * */

public class Region implements Serializable {

    private double square; // площадь

    private long population; // населения

    private String language;

    private String city;

    protected ArrayList<District> districtArrayList = new ArrayList<>();

    public Region() {
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }

    public Region(double square, long population, String language, String city) {
        this.square = square;
        this.population = population;
        this.language = language;
        this.city = city;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 && population == region.population && Objects.equals(language, region.language) && Objects.equals(city, region.city) && Objects.equals(districtArrayList, region.districtArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, population, language, city, districtArrayList);
    }

    @Override
    public String toString() {
        return "Region{" +
                "square=" + square +
                ", population=" + population +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", districtArrayList=" + districtArrayList +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Region();
    }


    /**
     * @return площадь региона
     * из каждого района берет площадь и, обединяет и возврашае обшее количество.
     */
    public double getSquareRegion() {
        double squareRegion = 0.0D;
        for (int i = 0; i < districtArrayList.size(); i++) {
            squareRegion += districtArrayList.get(i).getDistrictArea();
        }
        return squareRegion;
    }

}
