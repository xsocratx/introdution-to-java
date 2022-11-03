package org.myexample.task4;

public class ReverseDouble {
    public static double getReverseDouble(String num) {
        final double numToDouble;
        final int integerPart;
        final int decimalPart;
        double reverseDouble;

        try {
            numToDouble = Double.parseDouble(num);
        } catch (NumberFormatException NFE) {
            throw NFE;
        }

        integerPart = (int)numToDouble;
        decimalPart = (int)(1000 * numToDouble - 1000 * integerPart);
        reverseDouble = (double)integerPart/1000 + decimalPart;

        return reverseDouble;
    }
}
