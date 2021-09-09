package com.task3;

import java.io.Serializable;
import java.util.Objects;

public class District implements Serializable {
    private double districtArea;
    private double height;
    private String timeZone;
    private long populationDistrict;

    public District() {
        this.districtArea = 0;
        this.height = 0;
        this.timeZone = "";
        this.populationDistrict = 0;
    }

    public District(double districtArea, double height, String timeZone, long populationDistrict) {
        this.districtArea = districtArea;
        this.height = height;
        this.timeZone = timeZone;
        this.populationDistrict = populationDistrict;
    }

    public double getDistrictArea() {
        return districtArea;
    }

    public void setDistrictArea(double districtArea) {
        this.districtArea = districtArea;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public long getPopulationDistrict() {
        return populationDistrict;
    }

    public void setPopulationDistrict(long populationDistrict) {
        this.populationDistrict = populationDistrict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.districtArea, districtArea) == 0 && Double.compare(district.height, height) == 0 && populationDistrict == district.populationDistrict && Objects.equals(timeZone, district.timeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtArea, height, timeZone, populationDistrict);
    }

    @Override
    public String toString() {
        return "District{" +
                "districtArea=" + districtArea +
                ", height=" + height +
                ", timeZone='" + timeZone + '\'' +
                ", populationDistrict=" + populationDistrict +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new District();
    }
}
