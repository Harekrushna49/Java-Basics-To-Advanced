package Interface.devices;

public class Test extends SmartPhone{
    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone();
        smartphone.on();
        smartphone.takePicture();
        smartphone.recordVideo();
        smartphone.playMusic();
        smartphone.playVideo();
        smartphone.makeCall(1234567890);
        smartphone.off();
    }
}
