package com.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void setTankVolumePositiveTest() {
        Car car = new Car();
        float actually = 25;
        car.setTankVolume(actually);
        float expected = car.getTankVolume();
        Assertions.assertEquals(expected,actually);
    }

    @Test
    void setTankVolumeNegativeTest(){
        Engine engine = new Engine("motorBmw","J360","3.5",2005);
        Wheel wheel = new Wheel(11,"Dunlop","Sedan","Winter");
        Car car = new Car(engine,wheel,"BMW",100.0F);
        float actually = 101;


      //  car.setTankVolume(actually);
        float expected = car.getTankVolume();
        //Assertions.assertEquals(expected,actually);
        System.out.println(car.toString() + car.gasUp(55));
    }


}