package org.myexample;

import org.myexample.task1.FunctionValue;
import org.myexample.task2.FunctionValue2;
import org.myexample.task3.FunctionValue3;
import org.myexample.task4.ReverseDouble;
import org.myexample.task5.ConvertorStoHMS;
import org.myexample.task6.PointInGivenArea;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // Reading value a1, b1, c1 for task_1
        System.out.println("**********Enter values for task_1:");
        System.out.println("Enter value a = ");
        String a1 = reader.readLine();
        System.out.println("Enter value b = ");
        String b1 = reader.readLine();
        System.out.println("Enter value c = ");
        String c1 = reader.readLine();

        System.out.println("((" + a1 + " - 3) * " + b1 + " / 2) + " + c1 + " = " + FunctionValue.findFunctionValue(a1, b1, c1));

        // Reading value a2, b2, c2 for task_2
        System.out.println("**********Enter values for task_2:");
        System.out.println("Enter value a = ");
        String a2 = reader.readLine();
        System.out.println("Enter value b = ");
        String b2 = reader.readLine();
        System.out.println("Enter value c = ");
        String c2 = reader.readLine();

        System.out.println(String.format("Task_2. Return - %f", FunctionValue2.findFunctionValue(a2, b2, c2)));

        // Reading values a3, b3 task_3
        System.out.println("**********Enter values for task_3:");
        System.out.println("Enter value x = ");
        String a3 = reader.readLine();
        System.out.println("Enter value y = ");
        String b3 = reader.readLine();

        System.out.println(String.format("Task_3. Return - %f", FunctionValue3.findFunctionValue(a3, b3)));

        // Reading value nnn.ddd task_4
        System.out.println("**********Enter value for task_4:");
        System.out.println("Enter value nnn.ddd = ");
        String doubleVal = reader.readLine();

        System.out.println(String.format("Task_4. Return - %f", ReverseDouble.getReverseDouble(doubleVal)));

        // Reading value nnn.ddd task_5
        System.out.println("**********Enter value for task_5:");
        System.out.println("Enter value T = ");
        String t = reader.readLine();

        System.out.println("Task_5. Return - " + ConvertorStoHMS.getHMSfromS(t));
        // Reading value nnn.ddd task_6
        System.out.println("**********Enter values for task_6:");
        System.out.println("Enter X = ");
        String x = reader.readLine();
        System.out.println("Enter Y = ");
        String y = reader.readLine();

        System.out.println("Task_6. Point in given area - " + PointInGivenArea.isPointInGivenAria(x, y));

        reader.close();
    }
}