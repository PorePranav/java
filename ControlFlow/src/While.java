public class While{
    public static void main(String[] args) {
        int count = 1;
        while(count != 6){
            System.out.println("Count value is: " + count);
            count++;
        }

        count = 1;
        System.out.println();
        for(int i = 1; i != 6; i++){
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println();
        count = 1;
        do{
            System.out.println("Count value was " + count);
            count++;
        }while(count != 6);

        int number = 4;
        int finishNumber = 20;

        while(number <= finishNumber){
            number++;
            if(!isEven(number))
                continue;
            System.out.print(number + " ");
        }

    }
    public static boolean isEven(int number){
        return (number % 2 == 0);
    }
}
