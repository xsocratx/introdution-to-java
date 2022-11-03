package org.myexample.task3;
import java.lang.Math;

public class FunctionValue3 {
    public static double findFunctionValue(String str1, String str2) {
        final double z;
        try {
            final double x = Double.parseDouble(str1);
            final double y = Double.parseDouble(str2);
            if (Math.cos(x) == Math.sin(y)) throw new ArithmeticException();
            z = (Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        } catch (NumberFormatException NFE) {
            throw NFE;
        } catch (ArithmeticException AE) {
            throw AE;
        }
        return z;
    }
}
