package FinalKeyword.Passwords;

public class Password {
    private static final int key = 91841098;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private static int encryptDecrypt(int password){
        return password ^ key;
    }

    public final void storePassword(){
        System.out.println("Saving password as: " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if(this.encryptedPassword == encryptDecrypt(password)){
            System.out.println("Welcome");
            return true;
        }
        else{
            System.out.println("Sorry, wrong password");
            return false;
        }
    }
}
