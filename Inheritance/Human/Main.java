package Inheritance.Human;

// Multilevel Inheritance
public class Main {
    public static void main(String[] args) {

        // Child Object
        Child ch1 = new Child();
        ch1.setName("Harekrushna Nayak");
        ch1.setAge(22);
        System.out.println("Child Name : "+ch1.getName());
        System.out.println("Age : "+ch1.getAge());

        Child ch2 = new Child();
        ch2.setName("Bikash Kumar Nayak");
        ch2.setAge(17);
        System.out.println("Child Name : "+ch2.getName());
        System.out.println("Age : "+ch2.getAge());

        //Parent Object
        Parent par1 = new Parent();
        par1.setName("Binod Nayak");
        par1.setAge(51);
        System.out.println("Father's Name : "+par1.getName());
        System.out.println("Age : "+par1.getAge());

        Parent par2 = new Parent();
        par2.setName("Sanjukta Nayak");
        par2.setAge(37);
        System.out.println("Mother's Name : "+par2.getName());
        System.out.println("Age : "+par2.getAge());

        //Grandparent Object
        Grandparent gar1 = new Grandparent();
        gar1.setName("Kashinath Nayak");
        gar1.setAge(77);
        System.out.println("Grandfather Name : "+gar1.getName());
        System.out.println("Age : "+gar1.getAge());

        Grandparent gar2 = new Grandparent();
        gar2.setName("Tambala Nayak");
        gar2.setAge(70);
        System.out.println("Grandmother Name : "+gar2.getName());
        System.out.println("Age : "+gar2.getAge());
    }
}
