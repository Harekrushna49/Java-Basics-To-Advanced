package Projects.ATM_Machine_Basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM trans = new ATM();

        System.out.print("Set your ATM PIN: ");
        int num = sc.nextInt();
        trans.setPin(num);

        trans.setBalance(50000); // Initial balance

        System.out.print("Enter your ATM PIN to access: ");
        int inputPin = sc.nextInt();
        trans.fetch(inputPin);

        sc.close(); // Close scanner after use
    }
}
