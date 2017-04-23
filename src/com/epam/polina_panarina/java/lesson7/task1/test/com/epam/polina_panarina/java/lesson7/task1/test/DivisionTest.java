package com.epam.polina_panarina.java.lesson7.task1.test;

import com.epam.polina_panarina.java.lesson7.task1.main.Division;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by home on 23.04.2017.
 */
class DivisionTest extends Division {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Description("Dividing operation checking.")
    @Test
    void operation() {
        Division div = new Division();
        assertEquals(2, div.operation(10, 5));
    }

    @Description("Dividing By Zero checking.")
    @Test
    void divisionByZero() {
        thrown.expect(Exception.class);
        new Division().operation(2, 0);

    }

    @Description("Result sign for first-negative and second-positive numbers checking. Had to be <=0 ")
    @Test
    void resultSignFirst() {
        Division div = new Division();
        double result = div.operation(-10, 5);
        assertTrue(result <= 0);
    }

    @Description("Result sign for first-positive and second-negative numbers checking. Had to be <=0 ")
    @Test
    void resultSignSecond() {
        Division div = new Division();
        double result = div.operation(10, -5);
        assertTrue(result <= 0);
    }

    @Description("Result sign for first-negative and second-negative numbers checking. Had to be >=0 ")
    @Test
    void resultSignThird() {
        Division div = new Division();
        double result = div.operation(-10, -5);
        assertTrue(result >= 0);

    }

    @Description("Result sign for positive numbers checking. Had to be >=0 ")
    @Test
    void resultSignFourth() {
        Division div = new Division();
        double result = div.operation(10, 5);
        assertTrue(result >= 0);

    }

    @Description("Result sign for first-negative and second-negative numbers checking. Had to be >=0 ")
    @Test
    void dividingZeroByNumber() {
        Division div = new Division();
        double result = div.operation(0, 5);
        assertTrue(result == 0);

    }
}