package org.example;

import org.example.task1.SumOfPosNum;
import org.example.task2.ValueOfFunctionSegment;
import org.example.task3.SumOfFirstHundredNumbers;
import org.example.task4.MultipleSqrtOfFirstTwoHundedNum;
import org.example.task5.SumOfNumberSeries;
import org.example.task6.ANCIItoStr;
import org.example.task7.NumberDivisors;
import org.example.task8.DigitsOfNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("***********Cycles***********");
        System.out.println("---Task1");
        System.out.println("Enter number = ");
        String num = reader.readLine();

        System.out.println("Sum of positive numbers  - " + SumOfPosNum.getSumNum(num));

        System.out.println("---Task2");
        System.out.println("Enter [a, b]. a = ");
        String a = reader.readLine();
        System.out.println("b = ");
        String b = reader.readLine();

        ValueOfFunctionSegment.getSegment(a, b);
        System.out.println("");

        System.out.println("---Task3");
        System.out.println("Sum of first hundred numbers is - " + SumOfFirstHundredNumbers.getSumNumbers());

        System.out.println("---Task4");
        System.out.println("Product of the squares of the first 200 numbers is " + MultipleSqrtOfFirstTwoHundedNum.getMultiple());


        System.out.println("---Task5");
        System.out.println("Enter E = ");
        String e = reader.readLine();

        System.out.println("Sum of Number Series is " + SumOfNumberSeries.getSumOfNumberSeries(e));

        System.out.println("---Task6");
        ANCIItoStr.getANCIIString();

        System.out.println("---Task7");
        System.out.println("Enter [m, n]. m = ");
        String m = reader.readLine();
        System.out.println("n = ");
        String n = reader.readLine();
        NumberDivisors.getNumberDivisorsOnSegment(m, n);

        System.out.println("----Task8");
        System.out.println("Enter first number - ");
        String num1 = reader.readLine();
        System.out.println("Enter second number - ");
        String num2 = reader.readLine();
        System.out.println("Common digits in numbers: ");
        DigitsOfNumbers.getDigitsOfNumber(num1,num2);

        reader.close();

    }
}