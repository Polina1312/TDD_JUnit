package com.epam.polina_panarina.java.lesson7.task2.test;

import com.epam.polina_panarina.java.lesson7.task2.main.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by home on 24.04.2017.
 */
public class StringCalculatorTest {

    @Test
    public void addEmptyString(){
        StringCalculator stringCalculator = new StringCalculator();
       assertEquals(0,stringCalculator.add(""));
    }

    @Test
    public void addOneNumber(){
        StringCalculator stringCalculator = new StringCalculator();
        int a = stringCalculator.add("1");
        assertEquals(1,a);
    }
}
