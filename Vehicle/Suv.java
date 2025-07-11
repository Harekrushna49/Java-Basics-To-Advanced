package Vehicle;

public class Suv extends Car {

    public Suv(String name, int gears, boolean isManual) {
        super(name, 4, "SUV", 5, gears, isManual);
    }

    public void accelerate(int rate) {
        int newSpeed = getcurrentspeed() + rate;

        if (newSpeed == 0) {
            stop();
            changeGear(1);
        } else if (newSpeed > 0 && newSpeed <= 30) {
            changeGear(2);
        } else if (newSpeed > 30 && newSpeed <= 60) {
            changeGear(3);
        } else if (newSpeed > 60 && newSpeed <= 90) {
            changeGear(4);
        } else if (newSpeed > 90 && newSpeed <= 120) {
            changeGear(5);
        } else if (newSpeed > 120) {
            changeGear(6);
        } else {
            changeGear(7);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getcurrentdirection());
        }
    }
}
