package FinalKeyword.Passwords;

public class Main {

    public static void main(String[] args) {
        int pw = 239840;
        Password password = new ExtendedPassword(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(23948);
        password.letMeIn(9834923);
        password.letMeIn(pw);
    }

}
