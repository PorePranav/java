package CarClass;

public class Main{
    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();

        porsche.setModel("Carrera");
        honda.setModel("Honda City");

        System.out.println(porsche.getModel());
        System.out.println(honda.getModel());
    }
}
