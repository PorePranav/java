package AccessModifiers;

import java.util.ArrayList;

public class Account{
    private final String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount > 0){
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        }
        else
            System.out.println("Cannot deposit negative sums");
    }

    public void withdraw(int amount){
        if(this.balance - amount < 0 || amount < 0)
            System.out.println("Balance is not sufficient");
        else{
            transactions.add(-amount);
            this.balance -= amount;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        }
    }
}
