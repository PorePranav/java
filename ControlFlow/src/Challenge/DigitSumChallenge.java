package Challenge;

public class DigitSumChallenge{
    public static void main(String[] args) {
        int sumOfDigits = sumDigits(542);

        if(sumOfDigits != -1)
            System.out.println("The sum of digits is: " + sumOfDigits);
        else
            System.out.println("Negative numbers are not allowed");
    }
    public static int sumDigits(int number){
        if(number < 0)
            return -1;
        int sumOfDigits = 0;
        while(number > 0){
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }
        return sumOfDigits;
    }
}
