package Challenge;

public class WhileChallenge{
    public static void main(String[] args) {
        int count = 0;
        int startNumber = 4;
        int endNumber = 20;

        while(count < 5){
            if(!isEven(startNumber)) {
                System.out.print(startNumber + " ");
                count++;
            }
            startNumber++;
        }
        System.out.println();
        System.out.println(count + " odd numbers were found");
    }
    public static boolean isEven(int number){
        return (number % 2 == 0);
    }
}
