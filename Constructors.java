class MyMainEmployee{
    int id;
    String name;
    public MyMainEmployee(int myid, String myname){
        id=myid;
        name=myname;
    }
    /*
    public void setId(){
        this.id=9;
    }
    public int getId(){
        return id;
    }
    public String setName(){
        this.name="Pintu";
    }
    public String getName(){
        return name;
    }
     */

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class Constructors {
    public static void main(String [] args){
        MyMainEmployee object=new MyMainEmployee(9,"Pintu");
        System.out.println(object.getId());
        System.out.println(object.getName());
    }
}
