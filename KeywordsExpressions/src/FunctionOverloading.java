import java.net.PortUnreachableException;
public class FunctionOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Pranav", 500);
        System.out.println("New score is: " + newScore);

        int anotherNewScore = calculateScore(250);
        System.out.println("Another new score is: " + anotherNewScore);

        calculateScore();
    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score);
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no player score");
    }
}
