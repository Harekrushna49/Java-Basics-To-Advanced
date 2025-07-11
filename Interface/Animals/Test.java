package Interface.Animals;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        d.Eat();
        d.Sleep();
        d.Play();
        System.out.println("Animal age = "+Animal.Age);
        System.out.println("Dog age = "+Dog.Age);
        Animal.info();
        d.run();
        c.run();
    }
}
