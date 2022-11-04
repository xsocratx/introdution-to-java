package org.example;

import org.example.task1.TriangleExistence;

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

        reader.close();
    }
}