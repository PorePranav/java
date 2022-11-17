package Inheritance.Animal;

public class Fish extends Animal{
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest(){
        System.out.println(getName() + " is now resting");
    }

    public void swim(int speed){
        System.out.println(getName() + " is now swimming with speed " + speed);
    }


}
