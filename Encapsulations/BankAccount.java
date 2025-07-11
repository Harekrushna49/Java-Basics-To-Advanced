
public class BankAccount {
    public static void main(String[] args) {
        //BankAccountLogic Details = new BankAccountLogic(2143561456l, "Binod Nayak", 20000000);
        BankAccountLogic Details = new BankAccountLogic();
        Details.setAccount(2301548879L);
        Details.setName("Harekrushna Nayak");
        Details.setBalance(0);
        System.out.println("Account Number : " +Details.getAccount());
        System.out.println("Account Holder Name : " +Details.getCustomer_Name());
        System.out.println("Account Balance : "+Details.getBalance());
        Details.Deposit(20000);
        Details.Withdrawl(1000);
        System.out.println("Available Balance : "+Details.getBalance());

        /* System.out.println("Account No : "+Details.getAccount());
        System.out.println("Account No : "+Details.getCustomer_Name());
        System.out.println("Account No : "+Details.getBalance()); */
    }
}
