package Challenge;

public class OverloadingFunctions {
    public static void main(String[] args) {
        System.out.println("5 feet and 11 inches is " + calcFeetAndInchesToCentimeters(5, 11) + " cm.");
        calcFeetAndInchesToCentimeters(11);
    }
    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet >= 0 && inches >= 0 && inches <= 12){
            int totalInches = (feet * 12) + inches;
            return totalInches * 2.54;
        }
        return -1;
    }

    public static void calcFeetAndInchesToCentimeters(int inches){
        int remainingInches = inches % 12;
        int totalFeet = inches / 12;
        double totalCentimeters = calcFeetAndInchesToCentimeters(totalFeet, remainingInches);
        System.out.println(inches + " inches is " + totalCentimeters + " cm.");
    }

}
