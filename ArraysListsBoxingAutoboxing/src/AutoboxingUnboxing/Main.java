package AutoboxingUnboxing;
import java.util.*;

class IntClass{
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue(){
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Pranav");

        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(54));

        for(int i = 0; i < intArrayList.size(); i++)
            System.out.println("Element " + (i + 1) + ": " + intArrayList.get(i).getMyValue());

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            integerArrayList.add(i);

        for(int i = 0; i < integerArrayList.size(); i++)
            System.out.println((i + 1) + ". " + integerArrayList.get(i));

        Integer myIntValue = 69;
        System.out.println(myIntValue);

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double i = 0.0; i < 10.0; i++)
            myDoubleValues.add(i);

        for(int i = 0; i < myDoubleValues.size(); i++)
            System.out.println((i + 1) + ". " + myDoubleValues.get(i));
    }
}
