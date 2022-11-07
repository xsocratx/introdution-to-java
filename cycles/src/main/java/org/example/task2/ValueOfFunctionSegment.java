package org.example.task2;

public class ValueOfFunctionSegment {
    public static void getSegment(String aStr, String bStr) throws NumberFormatException{

        final int a, b;

        a = Integer.parseInt(aStr);
        b = Integer.parseInt(bStr);

        for (int i = a; i <= b; i++){
            if(i > 2) System.out.print(i + " ");
            else if (i <= 2) {
                System.out.print(-i + " ");
            }
        }
    }
}
