package banksimulation;
public class Bank {
    private String bankName;
    protected String branchLocation;
    int establishedYear;
    public double totalAssets;

    Bank(String bankName,String branchLocation, int establishedYear, double totalAssets) {
        this.bankName=bankName;
        this.branchLocation=branchLocation;
        this.establishedYear=establishedYear;
        this.totalAssets=totalAssets;
    }
    
    public String getBankName() {
        return this.bankName;
    }
    public String getBranchLocation() {
        return this.branchLocation;
    }
    public int getEstablishedYear() {
        return this.establishedYear;
    }
    public double getTotalAssets() {
        return this.totalAssets;
    }
}