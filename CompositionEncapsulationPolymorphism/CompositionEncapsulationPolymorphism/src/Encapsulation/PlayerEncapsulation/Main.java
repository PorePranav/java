package Encapsulation.PlayerEncapsulation;
public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Pranav";
//        player.health = 100;
//        player.weapon = "Sword";
//
//        player.loseHealth(50);
//        System.out.println("Remaining health is: " + player.getHealth());
//
//        player.loseHealth(60);
//        System.out.println("Remaining health is: " + player.getHealth());

        EnhancedPlayer player = new EnhancedPlayer("Pranav", "Sword");
        System.out.println("Initial health is " + player.getHealth());


    }
}
