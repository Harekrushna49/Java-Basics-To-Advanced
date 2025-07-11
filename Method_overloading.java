public class Method_overloading {
    // Method Overloading
    /*public void foo(){
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

     */
    static void over(){
        System.out.println("Hii");
    }
    static void over(int a)   // Parameters
    {
        System.out.println("Hello Everyone "+a);
    }
    public static void main(String[] args) {
        over();  // Arguments
        over(100);  // Arguments

        /*obj.foo();
        obj.foo(1);
        obj.foo(100,1000);
        obj.foo(10000,100000, 10000000);
         */
    }
}
