package Challenge.Bank;

public class Main{
    public static void main(String[] args) {
//        Account newAccount = new Account("12345", 0.00, "Pranav Pore", "pranav@pranavpore.com", "8805010299");
//        newAccount.depositFunds(1000);
//        newAccount.depositFunds(500);
//        newAccount.withdrawFunds(500);
//        newAccount.withdrawFunds(1200);
//
//        System.out.println(newAccount.getNumber());
//        System.out.println(newAccount.getCustomerName());
//
//        Account pranavAccount = new Account();
//
//        System.out.println(pranavAccount.getNumber());
//        System.out.println(pranavAccount.getCustomerName());

        VipCustomer aashish= new VipCustomer("Aashish", "aashish.pore@gmail.com");
        System.out.println(aashish.getName());
        System.out.println(aashish.geteMail());
        System.out.println(aashish.getCreditLimit());
        System.out.println();

        VipCustomer pranav = new VipCustomer();
        System.out.println(pranav.getName());
        System.out.println(pranav.geteMail());
        System.out.println(pranav.getCreditLimit());
    }
}
