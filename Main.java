// Abstract class BankAccount Q10
abstract class BankAccount {
    protected String accountId;
    protected String accountType;
    protected double balance;

    // Method to initialize the values of data members
    public void initialize(String accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to display the value of data members
    public void display() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    // Abstract method to calculate and display the interest
    public abstract void calculateInterest();
}

// Subclass SavingsAccount extending BankAccount
class SavingsAccount extends BankAccount {
    // Implementation of calculateInterest method for Savings Account
    @Override
    public void calculateInterest() {
        double interest = balance * 0.02; // 2% interest rate for Savings Account
        System.out.println("Interest calculated for Savings Account: " + interest);
    }
}

// Subclass CurrentAccount extending BankAccount
class CurrentAccount extends BankAccount {
    // Implementation of calculateInterest method for Current Account
    @Override
    public void calculateInterest() {
        double interest = balance * 0.00; // 0% interest rate for Current Account
        System.out.println("Interest calculated for Current Account: " + interest);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create objects of SavingsAccount and CurrentAccount
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        // Initialize and display details of SavingsAccount
        savingsAccount.initialize("SA001", "Savings", 5000.0);
        System.out.println("Details of Savings Account:");
        savingsAccount.display();
        savingsAccount.calculateInterest();

        System.out.println(); // Empty line for clarity

        // Initialize and display details of CurrentAccount
        currentAccount.initialize("CA001", "Current", 10000.0);
        System.out.println("Details of Current Account:");
        currentAccount.display();
        currentAccount.calculateInterest();
    }
}
