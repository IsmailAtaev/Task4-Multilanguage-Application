package com.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ismaTest {

    @Test
    void met() {
        isma ismaS = new isma();
        boolean actually =  true;
        boolean expected = ismaS.met();
        Assertions.assertEquals(expected, actually);
    }
}