//Created by Pranav on 7th Apr 2022
package com.pranavpore;

public class ByteShortLongIntChallenge {
    public static void main(String[] args) {
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;

        long longTotal = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println("longTotal: " + longTotal);

        short shortTotal = (short)(1000 + 10 * (myByte + myShort + myInt));
        System.out.println("shortTotal: " + shortTotal);

    }
}
