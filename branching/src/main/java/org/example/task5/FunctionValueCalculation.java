package org.example.task5;

public class FunctionValueCalculation {
    public static double calculateFunctionValue(String xStr) throws NumberFormatException{

        final int x;
        final double result;
        x = Integer.parseInt(xStr);

        if (x <= 3){
            result = x * x - 3 * x + 9;
            return result;
        }
        result = x * x * x + 6;
        return 1/result;
    }
}
