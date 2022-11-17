//Created by Pranav on 7th Apr 2022
package com.pranavpore;

public class ByteShortLongInt {
    public static void main(String[] args){
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Minimum value: " + myMinIntValue);
        System.out.println("Maximum value: " + myMaxIntValue);

        System.out.println("Busted MAX value: " + (myMaxIntValue+1));
        System.out.println("Busted MIN value: " + (myMinIntValue-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Minimum value for byte: " + myMinByteValue);
        System.out.println("Maximum value for byte: " + myMaxByteValue);

        System.out.println("Busted MAX value: " + (myMaxByteValue+1));
        System.out.println("Busted MIN value: " + (myMinByteValue-1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Minimum value for short: " + myMinShortValue);
        System.out.println("Maximum value for short: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Minimum value for long is: " + myMinLongValue);
        System.out.println("Maximum value for long is: " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(myMinIntValue/2);
        short myNewShortValue = (short)(myMinIntValue/2);
        System.out.println("myNewByteValue: " + myNewByteValue);
        System.out.println("myNewShortValue: " + myNewShortValue);
    }
}
