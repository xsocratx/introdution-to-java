package org.example;

import org.example.task1.TriangleExistence;
import org.example.task2.MaxMinMin;

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
        String a = reader.readLine();
        System.out.println("Enter second variable = ");
        String b = reader.readLine();
        System.out.println("Enter third variable = ");
        String c = reader.readLine();
        System.out.println("Enter fourth variable = ");
        String d = reader.readLine();

        System.out.println(String.format("calculation result - %d",
                MaxMinMin.getMaxValue(MaxMinMin.getMinValue(a, b), MaxMinMin.getMinValue(c,d))));

        reader.close();
    }
}