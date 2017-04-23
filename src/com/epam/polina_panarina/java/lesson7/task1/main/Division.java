package com.epam.polina_panarina.java.lesson7.task1.main;

/**
 * Created by Polina_Panarina on 4/18/2017.
 */
public class Division extends Operation {
    @Override
    public double operation(int a, int b) {
        double divideResult;
        if (b == 0) {
            System.out.println("You can't divide by zero");
            divideResult = 0;
        } else {
            divideResult = (double) a / (double) b;
        }
        return divideResult;
    }
}
