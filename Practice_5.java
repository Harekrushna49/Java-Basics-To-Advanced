class Employee1{
    int Salary;
    String Name;
    public int getsalary(){
        return Salary;
    }
    public String getname(){
        return Name;
    }
    public void setsalary(int s){
        Salary=s;
    }
    public void setname(String n){
        Name=n;
    }

    public static class Practice_5 {
        public static void main(String[] args) {
            System.out.println("Showing Employee Details");
            Employee1 object=new Employee1();
            object.setsalary(75000);
            object.setname("Pintu");
            System.out.println("Sallary : "+object.getsalary());
            System.out.println("Name : "+object.getname());
        }
    }
}
