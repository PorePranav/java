package Challenge;

public class SwitchChallenge{
    public static void main(String[] args) {
        char switchVariable = 'C';
        switch(switchVariable){
            case 'A':
                System.out.println("switchVariable was A");
                break;

            case 'B':
                System.out.println("switchVariable was B");
                break;

            case 'C':
                System.out.println("switchVariable was C");
                break;

            case 'D':
                System.out.println("switchVariable was D");
                break;

            case 'E':
                System.out.println("switchVariable was E");
                break;

            default:
                System.out.println("Neither A, B, C, D or E");
        }
        String month = "JanuARY";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;

            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Neither Jan or Jun");
        }
    }
}
