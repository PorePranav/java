package InnerClass;
import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber = 0;
    private boolean clutchIsIn;

    public GearBox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
        clutchIsIn = true;

        for(int i = 0; i < maxGears; i++){
            addGear(i, i * 5.3);
        }
    }

    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio){
        if(number > 0 && number <= maxGears){
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if(newGear >=0 && newGear <= this.gears.size() && this.clutchIsIn){
            this.gearNumber = newGear;
            System.out.println("Gear " + newGear + " selected");
        }
        else {
            System.out.println("Grind!");
            this.gearNumber = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn){
            System.out.println("Grind!");
            return 0.0;
        }
        return revs * gears.get(gearNumber).getRatio();
    }

    private class Gear{
        private int gearNumber;
        private double ratio;

        public static int classNumber;
        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs){
            return revs * ratio;
        }

        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
