package Projects.ATM_Machine_Basic;

import java.util.Scanner;

public class ATM {
    private int pin;
    private double balance;

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
            System.out.println("\n===== ATM Menu =====");
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
                    sc.close(); // Good practice to close Scanner
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
