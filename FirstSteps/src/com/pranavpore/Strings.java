//Created by Pranav on 8th Apr 2022
package com.pranavpore;

public class Strings {
    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString: " + myString);

        myString = myString + ", and this is more";
        System.out.println("myString: " + myString);

        myString = myString + " \u00A9 2022";
        System.out.println("myString: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString: " + lastString);

        double doubleNumber = 124.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString: " + lastString);

    }
}
