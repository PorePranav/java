package Challenge;

public class ForChallenge{
    public static void main(String[] args){
        int count = 0, sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                if(count < 3) {
                    count++;
                    sum += i;
                    System.out.print(i + " ");
                }
                else
                    break;
            }
        }
    }
}
