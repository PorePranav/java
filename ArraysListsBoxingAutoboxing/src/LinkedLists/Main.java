package LinkedLists;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<>();

        addInOrder("Sydney", placesToVisit);
        addInOrder("Melbourne", placesToVisit);
        addInOrder("Brisbane", placesToVisit);
        addInOrder("Perth", placesToVisit);
        addInOrder("Canberra", placesToVisit);
        addInOrder("Adelaide", placesToVisit);
        addInOrder("Darwin", placesToVisit);

        addInOrder("Alice Springs", placesToVisit);
        addInOrder("Darwin", placesToVisit);

        printList(placesToVisit);
        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> placesToVisit){
        Iterator<String> i = placesToVisit.iterator();

        while(i.hasNext())
            System.out.println("Now visiting: " + i.next());

        System.out.println("==================================");
    }

    private static boolean addInOrder(String newCity, LinkedList<String> linkedList){
       ListIterator<String> listIterator = linkedList.listIterator();
       while(listIterator.hasNext()){
           int comparison = listIterator.next().compareTo(newCity);
           if(comparison == 0){
               System.out.println(newCity + " already exists in the list");
               return false;
           }
           if(comparison > 0){
               listIterator.previous();
               listIterator.add(newCity);
               return true;
           }
       }
        listIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<String> listIterator = cities.listIterator();
        if(cities.isEmpty()) {
            System.out.println("No cities in the list");
            return;
        }

        else{
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0 -> {
                    System.out.println("Vacation over");
                    quit = true;
                }
                case 1 -> {
                    if (!goingForward) {
                        if (listIterator.hasNext())
                            listIterator.next();

                        goingForward = true;
                    }
                    if (listIterator.hasNext())
                        System.out.println("Now visiting " + listIterator.next());
                    else {
                        System.out.println("Reached end of the list");
                        goingForward = false;
                    }
                }
                case 2 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious())
                            listIterator.previous();
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious())
                        System.out.println("Now visiting " + listIterator.previous());
                    else {
                        System.out.println("Reached beginning of the list");
                        goingForward = true;
                    }
                }
                case 3 -> printMenu();
                default -> System.out.println("Please enter a correct choice");
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - Quit the applications\n" +
                "1 - Go to next city\n" +
                "2 - Go to previous city\n" +
                "3 - Print the menu");
    }
}
