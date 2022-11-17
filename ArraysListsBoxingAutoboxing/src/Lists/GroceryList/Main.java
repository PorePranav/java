package Lists.GroceryList;

import java.util.Scanner;

public class Main {
    private static final GroceryList groceryList = new GroceryList();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();

        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            scanner.nextLine();

            switch(choice) {
                case 0 -> printInstructions();
                case 1 -> groceryList.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchItem();
                case 6 -> quit = true;
                default -> System.out.println("Enter a correct input");
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print the choice options. ");
        System.out.println("\t 1 - To print the items in the list. ");
        System.out.println("\t 2 - To add an item to the list. ");
        System.out.println("\t 3 - To modify an item in the list. ");
        System.out.println("\t 4 - To remove an item from the list. ");
        System.out.println("\t 5 - To search for an item in the grocery list. ");
        System.out.println("\t 6 - To quit the application. ");
    }

    public static void addItem(){
        System.out.println("Enter the item you wish to add in the list");
        groceryList.addGrocery(scanner.nextLine());
    }

    public static void modifyItem(){
        String oldItem;
        System.out.println("Enter the item you wish to modify");
        oldItem = scanner.nextLine();

        String newItem;
        System.out.println("Enter the name of the new item");
        newItem = scanner.nextLine();

        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem(){
        String item;
        System.out.println("Enter the item you wish to delete");
        item = scanner.nextLine();

        groceryList.removeItem(item);
    }

    public static void searchItem(){
        String searchName;
        System.out.println("Enter the item which you wish to search in the list");
        searchName = scanner.nextLine();

        String targetName = groceryList.findItem(searchName);

        if(targetName != null)
            System.out.println(targetName + " found in the list");
        else
            System.out.println(searchName + " not found in the list");
    }
}
