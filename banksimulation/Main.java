package banksimulation;

public class Main {
    public static void main(String[] args) {
        Bank bank=new Bank("Bank Of Baroda","Veena Nagar",2005,3600000);

        Account account=new Account(12345,"Shllok Osan",100000,12.5);

        SavingsAccount savingsAccount=new SavingsAccount(6789,"Mokksh Osan",50000,11.0);

        System.out.println(bank.getBankName()+bank.getBranchLocation()+bank.getEstablishedYear()+bank.getTotalAssets());
        System.out.println(account.getAccountNumber()+account.getAccountHolderName()+account.getBalance()+account.getInterestRate());
        System.out.println(savingsAccount.getAccountNumber()+savingsAccount.getAccountHolderName()+savingsAccount.getBalance()+savingsAccount.getInterestRate()+savingsAccount.calculateInterest());
    }
}
