class Parent{
    public Parent(){
        System.out.println("Hii, I am form Parent class.");
    }
    public void say(){
        System.out.println("Good Morning Boss, How can i help you today. ");
    }
    public void bright(){
        System.out.println("Ok, increasing brightness level to 90%.....");
    }
}
class Child extends Parent{
    public Child(){
        System.out.println("I am a Constructor form Child class.");
    }
    public void say2(){
        System.out.println("Good Afternoon Boss, How is your day going today.....");
    }
    @Override
    public void bright(){
        System.out.println("Thats great,ok calling to Roko.....");
    }
}
public class Test_2 {
    public static void main(String[] args) {

        /*byte a1 = 10;
        char a2 = 'g';
        int a3 = 22;
        float a4 = 12.15f;
        double a5 = 756_951.213D;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

         */

        /*
        Parent ob = new Parent();
        ob.say();
        ob.bright();
         */


        /*
        Child ob1 = new Child();
        ob1.say2();
        ob1.say2();
         */

        Parent ob2 = new Child();
        ob2.bright();
    }
}
