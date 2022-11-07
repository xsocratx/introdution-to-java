package org.example.task8;

public class DigitsOfNumbers {
    public static void getDigitsOfNumber(String number1Str, String number2Str) throws NumberFormatException{

        final int number1, number2;
        number1 = Math.abs(Integer.parseInt(number1Str));
        number2 = Math.abs(Integer.parseInt(number2Str));

        int digit1, digit2 = 0;
        int numTmp1 = number1;

        while (numTmp1 > 0){
            digit1 = numTmp1 % 10;
            numTmp1 = numTmp1 / 10;
            int numTmp2= number2;
            while (numTmp2 > 0) {
                digit2 = numTmp2 % 10;
                numTmp2 = numTmp2 / 10;
                if (digit1 == digit2){
                    System.out.print(digit1 + " ");
                }
            }
        }

    }

}
