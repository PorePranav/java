import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int newNumber = scanner.nextInt();
        System.out.println("The number entered was: " + newNumber);
    }
}
