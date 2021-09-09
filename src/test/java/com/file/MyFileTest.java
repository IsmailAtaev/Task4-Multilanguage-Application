package com.file;

import com.task2.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyFileTest {

    @Test
    void myWriteTest() {
        MyFile<Engine> engineMyFile = new MyFile<>();
        ArrayList<Engine> engineArrayList = new ArrayList<>();
        engineArrayList.add(new Engine("BMW", "G550", "5.5", 2001));
        engineArrayList.add(new Engine("Mercedes", "G550", "5.5", 2001));
        engineArrayList.add(new Engine("SportMustang", "KL5.300", "5.3", 1989));
        boolean expected = engineMyFile.myWrite(engineArrayList, "Engine.txt");
        Assertions.assertEquals(expected, true);
    }
    @Test
    void myReadTest() {
        MyFile<Engine> engineMyFile = new MyFile<>();
        ArrayList<Engine> engineArrayActually = new ArrayList<>();
        engineArrayActually.add(new Engine("BMW", "G550", "5.5", 2001));
        engineArrayActually.add(new Engine("Mercedes", "G550", "5.5", 2001));
        engineArrayActually.add(new Engine("SportMustang", "KL5.300", "5.3", 1989));
        ArrayList<Engine> engineArrayExpected = engineMyFile.myRead("Engine.txt");
        Assertions.assertEquals(engineArrayExpected, engineArrayActually);
    }


}