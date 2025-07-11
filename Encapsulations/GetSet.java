//package Encapsulations;

public class GetSet {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Harekrushna Nayak");
        std.setAge(22);
        std.setBranch("MCA");
        std.setYear(1);
        std.setSec("A");
        std.setRoll(2405297037L);

        System.out.println("Name : "+std.getName());
        System.out.println("Age : "+std.getAge());
        System.out.println("Branch : "+std.getBranch());
        System.out.println("Year : "+std.getYear());
        System.out.println("Sec : "+std.getSec());
        System.out.println("Roll No : "+std.getRoll());
    }    
}
