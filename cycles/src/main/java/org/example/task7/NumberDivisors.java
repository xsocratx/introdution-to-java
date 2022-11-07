package org.example.task7;

public class NumberDivisors {
    public static void getNumberDivisors(int num){
        for(int i = 2; i < Math.abs(num); i++){
            if(num % i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public static void getNumberDivisorsOnSegment(String mStr, String nStr) throws NumberFormatException{

        final int m, n;
        m = Integer.parseInt(mStr);
        n = Integer.parseInt(nStr);

        for(int i = m; i <= n; i++){
            System.out.print("Number - " + i + ": ");
            getNumberDivisors(i);
            System.out.println("");
        }
    }
}
