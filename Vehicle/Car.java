package Vehicle;

public class Car extends Vehicle_app {
    private int wheels = 4;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int wheels, String type, int doors, int gears, boolean isManual) {
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Change Gear method is called : Changed to " + this.currentGear + " gear.");
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("Change speed method is called : Changing speed to " + newSpeed + " and direction is " + newDirection);
    }
}
