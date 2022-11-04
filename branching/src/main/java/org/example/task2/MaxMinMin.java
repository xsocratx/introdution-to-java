package org.example.task2;

public class MaxMinMin {
    public static int getMinValue(String aStr, String bStr) throws NumberFormatException{

        final int a, b;
        a = Integer.parseInt(aStr);
        b = Integer.parseInt(bStr);

        if (a < b) return a;
        return b;
    }
    public static int getMaxValue(int c, int d){
        if (c > d) return c;
        return d;
    }
}
