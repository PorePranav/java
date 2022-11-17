package Challenge.Bank;

public class Account {
    private String accountNumber, number, customerName, email, phoneNumber;
    private double balance;

    public Account(){
        this("No number", 0.00, "No name", "No email", "No phonenumber");
        System.out.println("Empty constructor called.");
    }

    public Account(String number, double balance, String customerName, String email, String phoneNumber){
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositFunds(double funds){
        this.balance += funds;
        System.out.println(funds + "$ deposited in the account successfully");
    }

    public void withdrawFunds(double funds){
        if(funds > this.balance)
            System.out.println("Insufficient balance in the account");
        else{
            this.balance -= funds;
            System.out.println(funds + "$ withdrawn from the account successfully");
        }
    }


}
