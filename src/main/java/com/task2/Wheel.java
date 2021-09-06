package com.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Ataew Ismayyl
 * */


public class Wheel {

    private static final Logger log = LogManager.getLogger(Wheel.class.getName());

    int wheelDiameter = 0;

    String wheelBrand;

    String wheelType; //* type it is sport or regular, bicycle

    String typeSeason; //* winter or summer

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public String getWheelBrand() {
        return wheelBrand;
    }

    public void setWheelBrand(String wheelBrand) {
        this.wheelBrand = wheelBrand;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getTypeSeason() {
        return typeSeason;
    }

    public void setTypeSeason(String typeSeason) {
        this.typeSeason = typeSeason;
    }


}
