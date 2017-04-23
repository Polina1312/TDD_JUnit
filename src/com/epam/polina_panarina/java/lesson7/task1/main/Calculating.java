package com.epam.polina_panarina.java.lesson7.task1.main;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by home on 17.04.2017.
 */
public class Calculating {
    public String operation;
    public int a;
    public int b;


    public Sum sum = new Sum();
    public Remainder remainder = new Remainder();
    public Multiplication multiplication = new Multiplication();
    public Division division = new Division();

    public void expressionEntering() {
        String expression;
        InputStream stdin = System.in;
        System.out.println("\n" + "Enter an expression for computation. It had has this type: " + "\n" +
                "A[space]B[space]SYMBOL -> example (5 6 *)");
//        try {
//            System.setIn(new ByteArrayInputStream(expression.getBytes()));
//            Scanner scanner = new Scanner(System.in);
//            System.out.println(scanner.nextLine());
//        }
//

//        } finally {
//            System.setIn(stdin);
//        }
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            expression = br.readLine();
            String[] splitExpression = expression.split("\\s+");
            a = Integer.parseInt(splitExpression[0]);
            b = Integer.parseInt(splitExpression[1]);
            operation = splitExpression[2];
        } catch (Exception e) {
            System.out.println("You tried to enter an invalid symbol.");
        }


    }

    public double operatorDetermination() {

        expressionEntering();
        double result;
        String divideType2 = "/";
        String divideType1 = "divide";
        String multiplyType2 = "*";
        String multiplyType1 = "multiply";
        String minusType2 = "-";
        String minusType1 = "minus";
        String sumType2 = "+";
        String sumType1 = "sum";
        if (minusType1.equals(operation) || minusType2.equals(operation)) {
            result = remainder.operation(a, b);
        } else if (sumType1.equals(operation) || sumType2.equals(operation)) {
            result = sum.operation(a, b);
        } else if (multiplyType1.equals(operation) || multiplyType2.equals(operation)) {
            result = multiplication.operation(a, b);
        } else if (divideType1.equals(operation) || divideType2.equals(operation)) {
            result = division.operation(a, b);
        } else {
            System.out.println("Invalid type of operation. Check entered symbol/s");
            result = 0;
        }
        return result;
    }

    public double computation() {
        double result = operatorDetermination();
//        do {

        System.out.printf("Result of calculating: " + "%8.2f", result);
        // sc.close();
        return result;

//        } while (true);
    }
}
