package Inheritance.Animals;

//Single Inheritance
public class Animal {
    private String Name;
    private String Owner_Name;
    private int Age;

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void setOwner_Name(String Owner_Name) {
        this.Owner_Name = Owner_Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public String getOwner_Name() {
        return Owner_Name;
    }

    public int getAge() {
        return Age;
    }

    public void Eat()
    {
        System.out.println("Animals Eat Foods");
    }
    public void SayHello()
    {
        System.out.println("");
    }

}
