package Abstraction;

public class Car extends Vehicle{
    @Override
    public void TurningOn() {
        System.out.println("Car is turning on.");
    }

    @Override
    public void TurningOff() {
        System.out.println("Car is turning off.");
    }
}
