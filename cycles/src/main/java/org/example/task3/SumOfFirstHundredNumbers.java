package org.example.task3;

public class SumOfFirstHundredNumbers {
    public static int getSumNumbers(){

        int sum = 0;

        for(int i = 0; i <= 100; i++){
            sum += i * i;
        }

        return sum;
    }
}
