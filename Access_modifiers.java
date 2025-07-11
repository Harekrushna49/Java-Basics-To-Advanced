class Myname{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
        Myname details=new Myname();
        details.setAge(21);
        details.setName("Pintu");
        System.out.print("Jay Jagannath Everyone!!!, My age is "+details.getAge());
        System.out.print(" and my name is "+details.getName()+".");
    }
}
