package Interfaces.Telephone;

public class Main {
    public static void main(String[] args) {
      ITelephone pranavsPhone = new DeskPhone(123456);
//        pranavsPhone.powerOn();
//        pranavsPhone.callPhone(123456);
//        pranavsPhone.answer();
        
        pranavsPhone = new MobilePhone(123456);
        pranavsPhone.powerOn();
        pranavsPhone.callPhone(123456);
        pranavsPhone.answer();
    }
}
