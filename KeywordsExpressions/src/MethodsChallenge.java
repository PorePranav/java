//Created by Pranav on 17th Apr 2022
public class MethodsChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Sheldon", calculateHighScorePosition(1000));
        displayHighScorePosition("Leonard", calculateHighScorePosition(900));
        displayHighScorePosition("Raj", calculateHighScorePosition(400));
        displayHighScorePosition("Howard", calculateHighScorePosition(50));
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get position " + position + " on the leaderboard");
    }

    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score >= 1000)
            position = 1;
        else if(score >= 500)
            position = 2;
        else if(score >= 100)
            position = 3;
        return position;
    }
}
