package com.epam.polina_panarina.java.lesson7.task1.test;

import com.epam.polina_panarina.java.lesson7.task1.main.Calculating;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by home on 23.04.2017.
 */
class CalculatingTest {


    @Test
    void expressionEntering() {
    }

    @Test
    void operatorDetermination() {
       // Calculating calculating = new Calculating();

    }

    @Test
    void computation() {
       Calculating calculating = new Calculating();
        int b = 7;
        int a = 6;
        double preResult = a + b;
        double result = calculating.computation();
        assertEquals(preResult, result);
    }

}