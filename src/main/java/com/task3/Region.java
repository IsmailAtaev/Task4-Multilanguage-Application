package com.task3;

import java.io.Serializable;
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
    private String language; // язык

    public Region() {
    }

    public Region(double square, long population, String language) {
        this.square = square;
        this.population = population;
        this.language = language;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.square, square) == 0 && population == region.population && Objects.equals(language, region.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(square, population, language);
    }

    @Override
    public String toString() {
        return "Region{" +
                "square=" + square +
                ", population=" + population +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Region();
    }
}
