//Created by Pranav on 17th Apr 2022
public class Statement {
    public static void main(String[] args) {
        int myVariable = 50; //Statement
        myVariable++; //Statement
        myVariable--; //Statement
        System.out.println("This is a test");

        System.out.println("This is " +
                           "another " +
                           "still more.");

        int anotherVariable = 50; myVariable--; //Statement can be put in one line but isn't recommended
        System.out.println("This is another one");

        int            myAnotherVariable
            =
                50; //Whitespaces are ignored automatically

        System.out.println(myAnotherVariable);



    }
}
