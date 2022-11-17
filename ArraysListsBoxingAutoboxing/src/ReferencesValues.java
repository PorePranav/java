import java.util.Arrays;

public class ReferencesValues{
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("After change, myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change, anotherArray = " + Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        anotherArray = new int[] {1, 2, 3, 4, 5};

        System.out.println("After change, myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change, anotherArray = " + Arrays.toString(anotherArray));


    }

    private static void modifyArray(int[] array){
        array[1] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }
}
