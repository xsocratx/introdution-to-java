package org.example.task4;

import java.math.BigInteger;

public class MultipleSqrtOfFirstTwoHundedNum {
    public static BigInteger getMultiple(){

        BigInteger sum = BigInteger.valueOf(1);

            for(int i = 1; i <= 200; i++ ){
            sum = sum.multiply(BigInteger.valueOf(i*i)) ;
        }
        return sum;
    }
}
