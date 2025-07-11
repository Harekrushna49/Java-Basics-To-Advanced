class thi{
    int a;
    thi(int a){
        System.out.println("I am a Constructor.");
        this.a=a;
    }
    public int getA(){
        return a;
    }
}
public class This_keyword {
    public static void main(String[] args) {
        thi obj = new thi(4);
        System.out.println(obj.getA());
    }
}
