package com.epam.polina_panarina.java.lesson7.task1.test;

import com.epam.polina_panarina.java.lesson7.task1.main.Multiplication;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by home on 23.04.2017.
 */
class MultiplicationTest {


    @Description("Multiplication operation checking.")
    @Test
    void operation() {
        Multiplication mult = new Multiplication();
        assertEquals(6, mult.operation(2, 3));
    }


    @Test
    void resultSignFirst() {
        Multiplication mult = new Multiplication();
        double result = mult.operation(-10, 5);
        assertTrue(result <= 0);
    }


    @Test
    void resultSignSecond() {
        Multiplication mult = new Multiplication();
        double result = mult.operation(-10, 5);
        assertTrue(result <= 0);
    }


    @Test
    void resultSignThird() {
        Multiplication mult = new Multiplication();
        double result = mult.operation(-10, -5);
        assertTrue(result >= 0);
    }


    @Test
    void resultSignFourth() {
        Multiplication mult = new Multiplication();
        double result = mult.operation(0, -5);
        assertTrue(result == 0);
    }


    @Test
    void resultSignFifth() {
        Multiplication mult = new Multiplication();
        double result = mult.operation(0, 5);
        assertTrue(result == 0);
    }

}