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

    private String nameRegion;

    protected ArrayList<District> districtArrayList = new ArrayList<>();


    public Region() {
    }

    public ArrayList<District> getDistrictArrayList() {
        return districtArrayList;
    }

    public void setDistrictArrayList(ArrayList<District> districtArrayList) {
        this.districtArrayList = districtArrayList;
    }

    public Region(String language, String city, String nameRegion) {
        this.square = this.getSquareRegion();
        this.population = population;
        this.language = language;
        this.city = city;
        this.nameRegion = nameRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }

    public void setNameRegion(String nameRegion) {
        this.nameRegion = nameRegion;
    }

    public long getPopulation() {
        population = 0;
        for (int i = 0; i < districtArrayList.size(); i++) {
            population += districtArrayList.get(i).getPopulationDistrict();
        }
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
        return Double.compare(region.square, square) == 0 && population == region.population && Objects.equals(language, region.language) && Objects.equals(city, region.city) && Objects.equals(nameRegion, region.nameRegion) && Objects.equals(districtArrayList, region.districtArrayList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, population, language, city, nameRegion, districtArrayList);
    }

    @Override
    public String toString() {
        return "Region{" +
                "square=" + square +
                ", population=" + population +
                ", language='" + language + '\'' +
                ", city='" + city + '\'' +
                ", nameRegion='" + nameRegion + '\'' +
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
        this.square = 0;
        for (int i = 0; i < districtArrayList.size(); i++) {
            square += districtArrayList.get(i).getDistrictArea();
        }
        return square;
    }

}
