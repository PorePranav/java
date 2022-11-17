package Arrays;
import java.util.Scanner;

public class SortedArray {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        int[] sortedArray = sortIntegers(myArray);
        printArray(sortedArray);
    }
    public static int[] getIntegers(int size){
        int[] myArray = new int[size];
        for(int i = 0; i < size; i++)
            myArray[i] = scanner.nextInt();

        return myArray;
    }

    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++)
            System.out.println("Element " + i + " contents " + myArray[i]);
    }

    public static int[] sortIntegers(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            for(int j = i + 1; j < myArray.length; j++){
                if(myArray[i] < myArray[j]){
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        return myArray;
    }
}
