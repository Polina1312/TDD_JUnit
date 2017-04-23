package com.epam.polina_panarina.java.lesson7.task1.test;

import com.epam.polina_panarina.java.lesson7.task1.main.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by home on 23.04.2017.
 */
class SumTest extends Sum {
    @Test
    void operation() {
        Sum summa = new Sum();
        int a = 7;
        int b = 6;
        double result = summa.operation(a, b);
        assertEquals(a + b, result);
    }

    @Test
    void resultSignFirst() {
        Sum summa = new Sum();
        int a = -10;
        int b = 5;
        double result = summa.operation(a, b);
        assertTrue(result < 0 && result > a);

    }


    @Test
    void resultSignSecond() {
        Sum summa = new Sum();
        int a = -4;
        int b = 5;
        double result = summa.operation(a, b);
        assertTrue(result > 0 && result < b);
    }


    @Test
    void resultSignThird() {
        Sum summa = new Sum();
        int a = -10;
        int b = -5;
        double result = summa.operation(a, b);
        assertTrue(result < 0 && result < a);
    }

    @Test
    void resultSignFourth() {
        Sum summa = new Sum();
        int a = 10;
        int b = 5;
        double result = summa.operation(a, b);
        assertTrue(result > 0 && result > a && result >b);
    }

    @Test
    void resultSignFifth() {
        Sum summa = new Sum();
        int a = 10;
        int b = 0;
        double result = summa.operation(a, b);
        assertTrue(result > 0 && result==a);
    }

    @Test
    void resultSignSixth() {
        Sum summa = new Sum();
        int a = 10;
        int b = -5;
        double result = summa.operation(a, b);
        assertTrue(result >0 && result < a);

    }

    @Test
    void resultSignSeventh() {
        Sum summa = new Sum();
        int a = 10;
        int b = -15;
        double result = summa.operation(a, b);
        assertTrue(result <0 && result < a);

    }
}