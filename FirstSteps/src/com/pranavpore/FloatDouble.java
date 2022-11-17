//Created by Pranav on 7th Apr 2022
package com.pranavpore;

public class FloatDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("myMinFloatValue: " + myMinFloatValue);
        System.out.println("myMaxFloatValue: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("myMinDoubleValue: " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue: " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;

        System.out.println("myIntValue: " + myIntValue);
        System.out.println("myFloatValue: " + myFloatValue);
        System.out.println("myDoubleValue: " + myDoubleValue);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
