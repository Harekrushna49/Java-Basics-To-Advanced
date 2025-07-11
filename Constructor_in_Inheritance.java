class Base1{
    public Base1(){
        System.out.println("I am a Constructor of Base1 class.");
    }
    public Base1(int a){
        System.out.println("I am a Overloaded Constructor of Base1 class with value of : "+a);
    }
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class Derive1 extends Base1{
    public Derive1(){
        super(1);
        System.out.println("I am a Constructor of Derive1 class.");
    }
    public Derive1(int a, int z){
        super(a);
        System.out.println("I am a Overloaded Constructor of Derive1 class with value of : "+z);
    }
   int y;
   public void setY(int y){
       this.y=y;
   }
   public int getY(){
       return y;
   }
}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {
        //Base1 obj=new Base1();
        Derive1 dev=new Derive1(2,5);
    }
}
