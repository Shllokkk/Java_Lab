package banksimulation;

public class Account {
    private int accountNumber;
    protected String accountHolderName;
    double balance;
    public double interestRate;

    Account(int accountNumber, String accountHolderName, double balance, double interestRate) {
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.interestRate=interestRate;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getAccountHolderName() {
        return this.accountHolderName;
    }
    public double getBalance() {
        return this.balance;
    }
    public double getInterestRate() {
        return this.interestRate;
    }
}

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance, interestRate);
    }

    double calculateInterest() {
        return (balance*interestRate);
    }
}