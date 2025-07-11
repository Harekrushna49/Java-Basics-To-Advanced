package Inheritance.Animals;

//Single Inheritance
public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        Cat ca = new Cat();        
        obj.setName("Rony");
        obj.setOwner_Name("Prabhudeva Nayak");
        obj.setAge(2);
        System.out.println("Pet Name : "+obj.getName());
        System.out.println("Owner Name : "+obj.getOwner_Name());
        System.out.println("Age : "+obj.getAge());
        
        obj.SayHello();
        obj.Eat();

        ca.setName("Bhagad Billa");
        ca.setOwner_Name("Sahil Kumar");
        ca.setAge(1);
        System.out.println("Pet Name : "+ca.getName());
        System.out.println("Owner Name : "+ca.getOwner_Name());
        System.out.println("Age : "+ca.getAge());
        
        ca.SayHello();
        ca.Eat();
    }  
}
