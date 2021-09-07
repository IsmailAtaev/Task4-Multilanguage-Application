package com.task2;

import java.util.Objects;

public class Engine {

    private String brand;
    private String model;
    private String engine;
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine1 = (Engine) o;
        return year == engine1.year && Objects.equals(brand, engine1.brand) && Objects.equals(model, engine1.model) && Objects.equals(engine, engine1.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engine, year);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Engine();
    }
}