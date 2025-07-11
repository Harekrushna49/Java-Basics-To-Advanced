package Interface.Animals;

public interface Animal {

    public int Age = 10;

    public abstract void Eat();
    abstract void Sleep();
    void Play();

    // We can only create static method in interface, because interface is an abstract class.
    // We can't create concrete/normal method in interface.
    // The access modifier of static method in interface is public.
    public static void info() {
        System.out.println("This is an Animal interface.");
    }

    // We can create default method in interface.
    // The access modifier of default method in interface is public.
    public default void run() {
        // We can access abstract method in child class.
        this.Sleep();
        this.Play();
        System.out.println("Animal is running.");
    }


}
