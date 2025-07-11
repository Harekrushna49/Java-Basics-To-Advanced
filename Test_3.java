public class Test_3 {
    public void foo(){
        System.out.println("Hii");
    }
    public void foo(int a){
        System.out.println("Hii "+a);
    }
    public void foo(int a, int b){
        System.out.println(a+" Hii "+b);
    }
    public void foo(int a, int b, int c){
        System.out.println(a+" Hii "+b+" Everyone "+c);
    }

    public static void main(String[] args) {
        Test_3 obj = new Test_3();
        obj.foo();
        obj.foo(1);
        obj.foo(100,1000);
        obj.foo(10000,100000, 10000000);
    }
}
