package Arrays;

import java.util.Scanner;

public class ArrayMain{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printIntegers(myIntegers);
        System.out.println("Average of the numbers is: " + calculateAverage(myIntegers));
    }

    public static int[] getIntegers(int size){
        int[] myIntegers = new int[size];
        System.out.println("Enter " + size + " integers");
        for(int i = 0; i < size; i++){
            myIntegers[i] = scanner.nextInt();
        }
        return myIntegers;
    }

    public static void printIntegers(int[] myIntegers){
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element " + (i + 1) + ": " + myIntegers[i]);
        }
    }

    public static double calculateAverage(int[] myIntegers){
        int sum = 0;
        for(int num : myIntegers)
            sum += num;
        return (sum * 1.0 / myIntegers.length);
    }
}
