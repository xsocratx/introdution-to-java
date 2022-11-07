package org.example.task5;

public class SumOfNumberSeries {
    public static double getSumOfNumberSeries(String eStr) throws NumberFormatException{

        final double e;
        double sum = 0;
        double val;
        e = Double.parseDouble(eStr);

        for(int i = 0; i <100 ;i++){
            val = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if( Math.abs(val) >= e){
                sum += val;
                System.out.println(sum);
            }
        }
        return sum;
    }
}
