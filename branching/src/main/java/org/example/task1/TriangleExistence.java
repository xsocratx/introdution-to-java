package org.example.task1;

public class TriangleExistence {
    public static String isTriangleExist(String angle1Str, String angle2Str) throws NumberFormatException{

        final int angle1 = Integer.parseInt(angle1Str);
        final int angle2 = Integer.parseInt(angle2Str);
        final int angle3;

        String result = "Triangle doesn't exist";

        angle3 = 180 - (angle1 + angle2);

        if ((angle3 > 0) && (angle1 > 0) && (angle2 > 0)) {
            result = "Triangle exists";
            if (angle3 == 90) {
                result = "Triangle exists and is a Right Triangle";
            }
        }

        return result;
    }
}
