package Arrays;
import java.util.*;

public class ResizeArray{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] originalArray = getArray();
        System.out.println(Arrays.toString(originalArray));

        int[] newArray = resizeArray(originalArray);
        System.out.println(Arrays.toString(newArray));
    }

    public static int[] getArray(){
        int[] newArray = new int[10];
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++)
            newArray[i] = scanner.nextInt();
        return newArray;
    }

    public static int[] resizeArray(int[] originalArray){
        int[] newArray = new int[12];
        for(int i = 0; i < originalArray.length; i++)
            newArray[i] = originalArray[i];
        System.out.println("Enter 2 new numbers: ");

        for(int i = originalArray.length ; i < newArray.length; i++)
            newArray[i] = scanner.nextInt();
        return newArray;
    }
}
