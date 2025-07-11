public class BankAccountLogic {
    private long Account;
    private String Customer_Name;
    private double Balance;

/*     public BankAccountLogic(long Account, String Customer_Name, double Balance)
    {
        this.Account = Account;
        this.Customer_Name = Customer_Name;
        this.Balance = Balance;
    } */
    
    public void Deposit(double amount)
    {
        if(amount > 0)
        {
            Balance += amount;
            System.out.println("Deposited : " +Balance);
        }
        else
        {
            System.out.println("Invalid Deposit Amount....");
        }
    }

    public void Withdrawl(double amount)
    {
        if(amount > 0 && amount <= Balance)
        {
            Balance -= amount;
            System.out.println("Withdrawl : " +Balance);
        }
        else
        {
            System.out.println("Insufficient Balance for withdrawl");
        }
    }

    public void setAccount(long Account_No)
    {
        Account = Account_No;
    }

    public void setName(String Name)
    {
        Customer_Name = Name;
    }

    public void setBalance(double Account_Balance)
    {
        this.Balance = Account_Balance;
    }

    public long getAccount()
    {
        return Account;
    }

    public String getCustomer_Name()
    {
        return Customer_Name;
    }

    public double getBalance()
    {
        return Balance;
    }
}
