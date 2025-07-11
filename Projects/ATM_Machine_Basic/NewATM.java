package Projects.ATM_Machine_Basic;


import java.util.Scanner;

class ATM1 {
    private int pin;
    private double balance;

    /* <<<<<<<<<<<<<<  ✨ Windsurf Command ⭐ >>>>>>>>>>>>>>>> */
    /**
     * Given a PIN number, fetches the ATM menu if the PIN is correct;
     * otherwise, prints an error message.
     *
     * @param pinNum the PIN number to validate
     */
    /* <<<<<<<<<<  68e9b55e-3aa2-42b1-ad8e-60a627d1b8c7  >>>>>>>>>>> */
    public void fetch(int pinNum) {
        if (pinNum == pin) {
            menu();
        } else {
            System.out.println("You have entered a wrong PIN. Enter a valid PIN.");
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int opt = sc.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("Your current balance is: ₹" + balance);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    sc.close(); // Closing Scanner to prevent resource leak
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount + ". Updated Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount...");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + ". Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount...");
        }
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }
}


public class NewATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM1 trans = new ATM1();

        System.out.print("Set your ATM PIN: ");
        int num = sc.nextInt();
        trans.setPin(num);

        trans.setBalance(50000); // Initial balance set

        System.out.print("Enter your ATM PIN to access: ");
        int inputPin = sc.nextInt();
        trans.fetch(inputPin); // Call fetch() with pin

        sc.close(); // Closing Scanner to prevent resource leak
    }
}
