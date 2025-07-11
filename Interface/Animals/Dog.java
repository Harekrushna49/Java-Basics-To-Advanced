package Interface.Animals;

public class Dog implements Animal{
    @Override
    public void Eat() {
        System.out.println("Dog eats Foods");
    }

    @Override
    public void Sleep() {
        System.out.println("Dog is Sleeping");
    }

    @Override
    public void Play() {
        System.out.println("Dog is Playing");
    }

}
