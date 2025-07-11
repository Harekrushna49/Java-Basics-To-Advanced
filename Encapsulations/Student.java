//package Encapsulations;

public class Student {

    // In Data Encapsulation we make all variable private, i.e; that variable cannot be accessed by in another class. 
    private String Name;
    private int Age;
    private String Branch;
    private int Year;
    private String Sec;
    private long Roll;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAge(int Age) {
        
        if(Age<18)
        System.out.println("You are an adult.");
        else
        System.out.println("Your age is above 18");
        this.Age = Age;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }

    public void setYear(int Year){
        this.Year=Year;
    }

    public void setSec(String Sec) {
        this.Sec = Sec;
    }

    public void setRoll(long Roll) {
        this.Roll = Roll;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public String getBranch() {
        return Branch;
    }

    public int getYear() {
        return Year;
    }

    public String getSec() {
        return Sec;
    }

    public long getRoll() {
        return Roll;
    }


}
