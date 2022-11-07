package org.example.task1;

public class SumOfPosNum {
    public static int getSumNum(String numStr) throws NumberFormatException, ArithmeticException{

        final int num;
        num = Integer.parseInt(numStr);

        int sum = 0;

        if (num <= 0) throw new ArithmeticException();

        for(int i = 1; i <= num; i++) sum += i;

        return sum;

    }
}
