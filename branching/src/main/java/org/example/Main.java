package org.example;

import org.example.task1.TriangleExistence;
import org.example.task2.MaxMinMin;
import org.example.task3.PointsOnLine;
import org.example.task4.BrickInHole;
import org.example.task5.FunctionValueCalculation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("***********Branching***********");

        System.out.println("---Enter values for task_1");
        System.out.println("Enter first angle = ");
        String angle1 = reader.readLine();
        System.out.println("Enter second angle = ");
        String angle2 = reader.readLine();

        System.out.println(TriangleExistence.isTriangleExist(angle1,angle2));

        System.out.println("---Enter values for task_2");
        System.out.println("Enter first variable = ");
        String a1 = reader.readLine();
        System.out.println("Enter second variable = ");
        String b1 = reader.readLine();
        System.out.println("Enter third variable = ");
        String c1 = reader.readLine();
        System.out.println("Enter fourth variable = ");
        String d1 = reader.readLine();

        System.out.println(String.format("calculation result - %d",
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue(a1, b1), MaxMinMin.getMinValue(c1,d1))));

        System.out.println("---Task3");
        final int x1 = -2;
        final int y1 = 4;
        final int x2 = 0;
        final int y2 = 0;
        final int x3 = -1;
        final int y3 = 2;
        System.out.println(String.format("(%d, %d), (%d, %d) and (%d, %d)", x1, y1, x2, y2, x3, y3));
        System.out.println("lie on a one line - " + PointsOnLine.isPointsOnLine(x1, y1, x2, y2, x3, y3));

        System.out.println("---Task4");
        final int a = 5;
        final int b = 6;
        final int x = 7;
        final int y = 4;
        final int z = 3;
        System.out.println("Brick with dimentions x = " + x + ", y = " + y + ", z = " + z +
                " will go through the hole with dimentions a = " + a + ", b = " + b +
                " - " + BrickInHole.isBrickGoThroughHole(a, b, x, y, z));

        System.out.println("---Task5");
        System.out.println("Enter x = ");
        String x_1 = reader.readLine();
        System.out.println("Function Value = " + FunctionValueCalculation.calculateFunctionValue(x_1));

        reader.close();
    }
}