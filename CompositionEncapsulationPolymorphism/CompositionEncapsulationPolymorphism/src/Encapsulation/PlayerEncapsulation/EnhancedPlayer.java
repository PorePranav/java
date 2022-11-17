package Encapsulation.PlayerEncapsulation;

public class EnhancedPlayer{
    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, String weapon) {
        this.name = name;
        this.health = 100;
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        health -= damage;
        if(health <= 0)
            System.out.println("Player knocked out ");
    }

    public int getHealth(){
        return health;
    }
}
