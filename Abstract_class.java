abstract class Parent2{
    public Parent2(){
        System.out.println("I am a constructor of Parent2.");
    }
    public void sayhello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet() {
        System.out.println("Good Morning.");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon.");
    }
}
abstract class Child3 extends Parent2{
    @Override
    public void greet(){
        System.out.println("I am goog.");
    }
    @Override
    public void greet2(){
        System.out.println("what about you ?");
    }
}
public class Abstract_class {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        Child2 c2 = new Child2();
    }
}
