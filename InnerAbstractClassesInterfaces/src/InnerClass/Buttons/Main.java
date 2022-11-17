package InnerClass.Buttons;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
        //Inner class
//        class ClickListener implements Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("Listener has been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title + " was clicked");
//            }
//        }
//        btnPrint.setOnClickListener(new ClickListener());

        //Anonymous class
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }
    private static void listen(){
        boolean quit = false;

        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> quit = true;
                case 1 -> btnPrint.onClick();
                default -> System.out.println("Please enter a correct value");
            }
        }
    }
}
