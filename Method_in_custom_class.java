class meth{
    int id;
    String name;
    int sallary;
    public void level(){
        System.out.print("Hii, my Employee id is "+id);
        System.out.print(", name is "+name);
        System.out.print(" and sallary was "+sallary);
        System.out.println();
    }
}

public class Method_in_custom_class {
    public static void main(String[] args) {
        meth cla=new meth();

        meth ano=new meth();
        // 1. 1st Employee
        cla.id=15;
        cla.name="Lakshay";
        cla.sallary=70000;
        // 2. 2nd Employee
        ano.id=12;
        ano.name="Nishant";
        ano.sallary=80000;
        cla.level();
        ano.level();
    }
}
