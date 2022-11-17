//Created by Pranav on 17th Apr 2022
public class Codeblocks {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if(score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000");
//        }
//        else if(score < 100){
//            System.out.println("Your score was less than 1000");
//        }
//        else{
//            System.out.println("Got here");
//        }

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }
}
