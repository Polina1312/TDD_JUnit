package com.epam.polina_panarina.java.lesson7.task1.test;

import com.epam.polina_panarina.java.lesson7.task1.main.Remainder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by home on 23.04.2017.
 */
class RemainderTest {
    @Test
    void operation() {
        Remainder remainder = new Remainder();
        int a = 10;
        int b = 5;
        double result = remainder.operation(a, b);
        assertEquals(a - b, result);
    }

    @Test
    void resultSignFirst() {
        Remainder remainder = new Remainder();
        int a = 10;
        int b = 5;
        double result = remainder.operation(a, b);
        assertTrue(result > 0 && result < a);
    }

    @Test
    void resultSignSecond() {
        Remainder remainder = new Remainder();
        int a = 5;
        int b = 10;
        double result = remainder.operation(a, b);
        assertTrue(result < 0 && result < a);
    }

    @Test
    void resultSignThird() {
        Remainder remainder = new Remainder();
        int a = -10;
        int b = 5;
        double result = remainder.operation(a, b);
        assertTrue(result < 0 && result < a);
    }

    @Test
    void resultSignFourth() {
        Remainder remainder = new Remainder();
        int a = 10;
        int b = -5;
        double result = remainder.operation(a, b);
        assertTrue(result > 0 && result > a);
    }

    @Test
    void resultSignFifth() {
        Remainder remainder = new Remainder();
        int a = -10;
        int b = -5;
        double result = remainder.operation(a, b);
        assertTrue(result < 0 && result > a);
    }

    @Test
    void resultSignSixth() {
        Remainder remainder = new Remainder();
        int a = 10;
        int b = 0;
        double result = remainder.operation(a, b);
        assertTrue(result == a);
    }

}