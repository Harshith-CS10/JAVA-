public enum BankName {
    ICICI(6.3),
    HDFC(5.8),
    SBI(6.0);

    double interestRate;

    // Constructor
    BankName(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}
public class BankAccount {
    private double accountBalance;
    private String accountHolderName;
    private BankName bankName;

    // Constructor
    public BankAccount(double accountBalance, String accountHolderName, BankName bankName) {
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
        this.bankName = bankName;
    }
}