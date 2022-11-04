package org.example.task4;

public class BrickInHole {
    public static boolean isBrickGoThroughHole(int a, int b, int x, int y, int z) {
        if ((a > x && b > y) || (a > y && b > x)
            || (a > x && b > z) || (a > z && b > x)
                || (a > y && b > z) || (a > z && b > y)){
            return true;
        }
        return false;
    }
}
