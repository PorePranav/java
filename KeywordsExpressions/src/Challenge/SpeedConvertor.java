package Challenge;//Created by Pranav on 6th May 2022

public class SpeedConvertor{
    public static void main(String[] args) {
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour){
        double milesDouble;
        long miles = 0;
        if(kilometersPerHour < 0)
            return -1;
        else{
            milesDouble = kilometersPerHour / 1.609;
            System.out.println(milesDouble);
            miles = Math.round(milesDouble);
        }
        return miles;
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
