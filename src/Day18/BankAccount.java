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

    // Method to print bank name
    public void printBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // Method to calculate interest
    public double calculateInterest(int numberOfYears) {
        double totalInterest = bankName.getInterestRate() * numberOfYears * accountBalance;
        return totalInterest;
    }

    public static void main(String[] args) {
        // Create new BankAccount instances
        BankAccount account1 = new BankAccount(12000, "Harshith", BankName.SBI);
        BankAccount account2 = new BankAccount(15000, "Girish", BankName.HDFC);

        // Print the bank name for each account
        account1.printBankName(); // Output: Bank Name: SBI
        account2.printBankName(); // Output: Bank Name: HDFC

        // Calculate and print total interest for each account
        System.out.println("Total Interest for Harshith: " + account1.calculateInterest(5));
        System.out.println("Total Interest for Girish: " + account2.calculateInterest(5));
    }
}
