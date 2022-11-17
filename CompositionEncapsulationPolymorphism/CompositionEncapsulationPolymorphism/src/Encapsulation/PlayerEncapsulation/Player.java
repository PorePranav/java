package Encapsulation.PlayerEncapsulation;

public class Player{
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if(health <= 0)
            System.out.println("Player knocked out ");
    }

    public int getHealth(){
        return health;
    }
}
