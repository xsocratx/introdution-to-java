package org.myexample.task2;
import java.lang.Math;

public class FunctionValue2 {
    public static double findFunctionValue(String str1, String str2, String str3) {
        final double z;
        try {
            final double a = Double.parseDouble(str1);
            final double b = Double.parseDouble(str2);
            final double c = Double.parseDouble(str3);
            if (a == 0) throw new ArithmeticException();
            z = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) * c + Math.pow(b, -2);
        } catch (NumberFormatException NFE) {
            throw NFE;
        } catch (ArithmeticException AE) {
            throw AE;
        }
        return z;
    }
}
