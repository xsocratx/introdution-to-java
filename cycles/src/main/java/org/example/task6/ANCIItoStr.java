package org.example.task6;

public class ANCIItoStr {
    public static void getANCIIString(){
        for(int i = 0; i <= 256; i++){
            System.out.println(i + " - " + Character.toString((char) i));
        }
    }
}
