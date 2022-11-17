public class Switch{
    public static void main(String[] args) {
        int value = 1;
        if(value == 1)
            System.out.println("Value was 1");
        if(value == 2)
            System.out.println("Value was 2");
        if(value == 3)
            System.out.println("Value was neither 1 nor 2");

        int switchValue = 5;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was a 3 or 4 or 5");
                System.out.println("Actually was a " + switchValue);

            case 6:
                System.out.println("Value was neither 1 nor 2");
                break;

            default:
                System.out.println("Was not 1 or 2");

        }
    }
}
