class phone{
    public void greet(){
        System.out.println("My name is java.");
    }
    public void on(){
        System.out.println("Turning on Phone....");
    }
}
class smartphone extends phone{
    public void swagat(){
        System.out.println("Apka swagat he.");
    }
    @Override
    public void on(){
        System.out.println("Turning on Smartphone!!!!");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        phone object = new phone(); // Allowed in java.
        smartphone smart = new smartphone(); // Allowed in java.
        phone obj = new smartphone(); // Allowed in java.
        // smartphone obj = new phone(); // Not allowed in java.
        object.greet();
        smart.swagat();
        obj.on();
    }
}
