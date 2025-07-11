class Base{
    int x;
    public void setX(int x){
        System.out.println("I am from Base setting X now.");
        this.x=x;
    }
    public int getX(){
        return x;
    }
    public void PrintMe(){
        System.out.println("I am a Constructor!!!");
    }
}
class Derive extends Base{
    int y;
    public void setY(int y){
        System.out.println("I am from Derive setting Y now.");
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
public class Inheritance {
    public static void main(String[] args) {

        // Creating an Object of Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        // Creating an object of Derive class
        Derive d = new Derive();
        d.setX(4);
        System.out.println(d.getX());
        d.setY(1);
        System.out.println(d.getY());
    }
}
