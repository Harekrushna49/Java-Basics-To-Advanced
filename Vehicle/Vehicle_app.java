package Vehicle;

public class Vehicle_app {
    private String name;
    private int currentspeed;
    private int currentdirection;

    public Vehicle_app(String name) {
        this.name = name;
        this.currentspeed = 0;
        this.currentdirection = 0;
    }

    public void steer(int direction) {
        this.currentdirection += direction;
        System.out.println("Steer method called : Steering at " + currentdirection + " degrees");
    }

    public void move(int speed, int direction) {
        currentspeed = speed;
        currentdirection = direction;
        System.out.println("move method called : Moving at speed " + currentspeed + " and direction " + currentdirection);
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setcurrentspeed(int speed) {
        this.currentspeed = speed;
    }

    public void setcurrentdirection(int direction) {
        this.currentdirection = direction;
    }

    public String getname() {
        return name;
    }

    public int getcurrentspeed() {
        return currentspeed;
    }

    public int getcurrentdirection() {
        return currentdirection;
    }

    public void stop() {
        this.currentspeed = 0;
    }
}
