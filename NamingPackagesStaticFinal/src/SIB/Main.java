package SIB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method called");
        SIBTest sibTest = new SIBTest();
        sibTest.someMethod();

        System.out.println("Owner is " + SIBTest.owner);
    }
}
