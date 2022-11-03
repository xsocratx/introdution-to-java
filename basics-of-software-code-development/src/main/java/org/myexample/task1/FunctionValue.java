package org.myexample.task1;

public class FunctionValue {
    public static double findFunctionValue(String a ,String b, String c){
        final double z;
        try{
            z = ((Double.parseDouble(a) - 3) * Double.parseDouble(b) / 2)
                    + Double.parseDouble(c);
        } catch (NumberFormatException NFE) {
            throw NFE;
        }
        return z;
    }

}
