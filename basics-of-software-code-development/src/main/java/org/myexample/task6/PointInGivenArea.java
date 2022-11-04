package org.myexample.task6;

public class PointInGivenArea {
    public static boolean isPointInGivenAria(String xStr, String yStr) throws NumberFormatException{

        final int x, y;
        final boolean result;

        x = Integer.parseInt(xStr);
        y = Integer.parseInt(yStr);

        result = ((-4 <= x) && (x <= 4) && (-3 <= y) && (y <= 0)) || ((-2 <= x) && (x <= 2) && (0 <= y) && (y <=4));

        return result;
    }
}
