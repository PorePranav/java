package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player pranav = new Player("Pranav", 10, 15);
        System.out.println(pranav);
        saveObject(pranav);

        pranav.setHitPoints(8);
        System.out.println(pranav);
        pranav.setWeapon("Stormbringer");
        saveObject(pranav);
        loadObject(pranav);

        System.out.println(pranav);
    }

    public static ArrayList<String> readValue(){
        ArrayList<String> values = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("""
                Choose
                1 to enter a string
                0 to quit""");

        while(!quit){
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> {
                    System.out.println("Enter a string: ");
                    String inputString = scanner.nextLine();
                    values.add(index, inputString);
                    index++;
                }
            }
        }
        return values;

    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValue();
        objectToLoad.readArrayList(values);
    }
}
