interface Bicycle{
    int a = 49;
    public void applyBreak(int decrement);
    public void speedUp(int increment);
}
interface BlowHorn{
    int b = 45;
    public void blowhorn();
    public void blowhorn2();
}
class AvonCycle implements Bicycle, BlowHorn{
    public void applyBreak(int decrement){
        System.out.println("Applying Break.....");
    }
    public void speedUp(int increment){
        System.out.println("Increasing Speed....");
    }
    public void blowhorn(){
        System.out.println("Pe Pe Pee...");
    }
    public void blowhorn2(){
        System.out.println("Me to yamala pagla dewana....");
    }
}
public class Interfaces {
    public static void main(String[] args) {
    AvonCycle Cy = new AvonCycle();
    Cy.applyBreak(10);
    Cy.speedUp(11);
    Cy.blowhorn();
    Cy.blowhorn2();
    System.out.println(Cy.a);
    System.out.println(Cy.b);
    }
}
