package com.task3;

import java.io.Serializable;
import java.util.Objects;

public class District implements Serializable {

    private double districtArea;

    private double height;

    private String timeZone;

    private long populationDistrict;

    private String nameDistrict;

    //
    public District() {
    }

    public District(double districtArea, double height, String timeZone, long populationDistrict, String nameDistrict) {
        this.districtArea = districtArea;
        this.height = height;
        this.timeZone = timeZone;
        this.populationDistrict = populationDistrict;
        this.nameDistrict = nameDistrict;
    }

    public District(double districtArea, double height, String timeZone, long populationDistrict) {
        this.districtArea = districtArea;
        this.height = height;
        this.timeZone = timeZone;
        this.populationDistrict = populationDistrict;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
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
        return Double.compare(district.districtArea, districtArea) == 0 && Double.compare(district.height, height) == 0 && populationDistrict == district.populationDistrict && Objects.equals(timeZone, district.timeZone) && Objects.equals(nameDistrict, district.nameDistrict);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtArea, height, timeZone, populationDistrict, nameDistrict);
    }

    @Override
    public String toString() {
        return "District{" +
                "districtArea=" + districtArea +
                ", height=" + height +
                ", timeZone='" + timeZone + '\'' +
                ", populationDistrict=" + populationDistrict +
                ", nameDistrict='" + nameDistrict + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new District();
    }
}