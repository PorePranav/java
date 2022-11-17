package Interfaces;

public class GearBox{
    private boolean isClutchIn;

    public void operateClutch(String inOrOut){
        this.isClutchIn = inOrOut.equalsIgnoreCase("in");
    }
}
