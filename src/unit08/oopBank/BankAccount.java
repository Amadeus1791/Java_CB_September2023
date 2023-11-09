package unit08.oopBank;

public class BankAccount {
    // fields
    private double balance;
    private Owner owner;
    private boolean isPremiumCustomer;

    // constructor
    public BankAccount() {
        //owner = "No owner yet";
    }

    public BankAccount(String owner, double balance) {
       // this.owner = owner;
        this.balance = balance;
    }

    public BankAccount(String owner) {
        this(owner, 0, false);
        // this.owner = owner;
    }

    public BankAccount(String owner, double balance, boolean isPremiumCustomer) {
      //  this.owner = owner;
        this.balance = balance;
        this.isPremiumCustomer = isPremiumCustomer;
    }


    // methods
    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }

    public void printBankAccount() {

    }

    public double getBalance() {
        return balance;
    }



    public boolean isPremiumCustomer() {
        return isPremiumCustomer;
    }

    public void setPremiumCustomer(boolean premiumCustomer) {
        this.isPremiumCustomer = premiumCustomer;
    }
}
