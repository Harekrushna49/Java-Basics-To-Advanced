class Overriding{
    public int pintu(){
        return 1;
    }
    public void meth2(){
        System.out.println("I am a method 2 of class Overriding.");
    }
}
class sub extends Overriding{
    @Override
    public void meth2(){
        System.out.println("I am a method 2 of class Sub.");
    }
    public void meth3(){
        System.out.println("I am a method 3 of class Sub.");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Overriding obj = new Overriding();
        obj.meth2();
        sub ovr = new sub();
        ovr.meth2();
    }
}
