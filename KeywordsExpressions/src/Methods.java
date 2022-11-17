//Created by Pranav on 17th Apr 2022
public class Methods {
    public static void main(String[] args) {
        int totalScore = calculateScore(true, 800, 5, 100);
        System.out.println("totalScore = " + totalScore);

        totalScore = calculateScore(true, 10000, 8, 200);
        System.out.println("totalScore = " + totalScore);

        totalScore = calculateScore(false, 20, 20, 20);
        System.out.println("totalScore = " + totalScore);

    }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        int finalScore;

        if(!gameOver)
            finalScore = -1;
        else
            finalScore = score + (levelCompleted * bonus);

        return finalScore;
    }
}
