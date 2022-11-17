package Challenge.Bank;

public class VipCustomer {
    private String name, eMail;
    private double creditLimit;

    VipCustomer(){
        this("No name", "No email", 10000.00);
    }

    VipCustomer(String name, String eMail){
        this(name, eMail, 10000.0);
    }

    VipCustomer(String name, String eMail, double creditLimit){
        this.name = name;
        this.eMail = eMail;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
