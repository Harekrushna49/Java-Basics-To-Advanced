package Interface.devices;

public class SmartPhone implements Camera, MusicPlayer, Phone{
    @Override
    public void on() {
        System.out.println("Turning on SmartPhone....");
    }

    @Override
    public void takePicture() {
        System.out.println("Taking picture...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    @Override
    public void playVideo() {
        System.out.println("Playing video...");
    }

    @Override
    public void makeCall(int number) {
        System.out.println("Making call..."+number);
    }

    @Override
    public void off() {
        System.out.println("Turning off SmartPhone....");
    }
}
