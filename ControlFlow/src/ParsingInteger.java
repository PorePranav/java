public class ParsingInteger {
    public static void main(String[] args) {
        String numberString = "2018";
        System.out.println("Number as string is: " + numberString);

        int numberInt = Integer.parseInt(numberString);
        System.out.println("Number as int is: " + numberInt);

        numberString += 1;
        numberInt += 1;

        System.out.println("Number as string after adding 1 is: " + numberString);
        System.out.println("Number as int after adding 1 is: " + numberInt);
    }
}
