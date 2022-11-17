package com.pranavpore;

public class OperatorChallenge{
    public static void main(String[] args) {
        double myValue = 20d;
        double mySecondValue = 80d;

        double result = (myValue + mySecondValue) * 100;
        double remainder = result % 40d;

        boolean myBool = remainder == 0;
        System.out.println(myBool);

        if(!myBool)
            System.out.println("Got some remainder");
    }
}
