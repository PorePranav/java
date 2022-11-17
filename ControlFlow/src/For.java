public class For{
    public static void main(String[] args) {
//        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 2% = " + calculateInterest(10000.0, 5.0));
//
//        System.out.println();


//        for(int i = 2; i <= 8; i++)
//            System.out.println("10, 000 at " + i + "% = " + String.format("%.2f", calculateInterest(10000, i)));
        System.out.println("Prime numbers between 1 and 10 are: ");
        for(int i = 1; i <= 100; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }

    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int num){
        if(num == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}
