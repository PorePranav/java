package Abstraction;

public class Penguin extends Bird{
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Not very good at that, can go for a swim instead");
    }
}
