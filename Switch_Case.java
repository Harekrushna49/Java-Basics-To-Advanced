import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age = ");
        int age = sc.nextInt();
        switch (age){
            case 18 :
                System.out.println("You are an Adult.");
                break;
            case 22 :
                System.out.println("You are going to join a Job.");
                break;
            case 60 :
                System.out.println("You are going to Retire.");
                break;
            default:
                System.out.println("Enjoy your Life!!!");
        }
    }
}
