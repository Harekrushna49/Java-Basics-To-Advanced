package Vehicle;

public class Main {
    public static void main(String[] args) {
        Suv rangeRover = new Suv("Range Rover", 7, false);
        rangeRover.move(60, 0);
        rangeRover.accelerate(20); // Optional: Try accelerating
        rangeRover.accelerate(60);
    }
}
