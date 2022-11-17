package AccessModifiers;

public class Main {

    public static void main(String[] args) {
        Account pranavsAccount = new Account("Pranav");
        pranavsAccount.deposit(1000);
        pranavsAccount.withdraw(500);
        pranavsAccount.withdraw(-200);
        pranavsAccount.deposit(-20);

        System.out.println("Balance of the account is " + pranavsAccount.getBalance());

    }

}
