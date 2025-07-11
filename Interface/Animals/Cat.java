package Interface.Animals;

public class Cat implements Animal {
    @Override
    public void Eat() {
        System.out.println("Cat is Eating");
    }

    @Override
    public void Sleep() {
        System.out.println("Cat is Sleeping");
    }

    @Override
    public void Play() {
        System.out.println("Cat is Playing");
    }

}
