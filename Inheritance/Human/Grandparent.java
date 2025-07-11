package Inheritance.Human;

// Multilevel Inheritance

public class Grandparent {
    private String Name;
    private int Age;
    private boolean ishasSuperPower;

    public Grandparent()
    {
        ishasSuperPower = true;
        System.out.println("I am a Constructor of Grandparent.");
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public boolean isHasSuperPower() {
        return ishasSuperPower;
    }
}
