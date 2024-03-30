abstract class BankAccount {
    protected String accountId;
    protected String accountType;
    protected double balance;

    public void initializeValues(String accountId, String accountType, double balance) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.balance = balance;
    }

    public void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }

    public abstract void calculateInterest();
}

class SavingsAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        double interest = 0.02 * balance;

        System.out.println("Interest (Savings Account): " + interest);
    }
}

class CurrentAccount extends BankAccount {
    @Override
    public void calculateInterest() {
        System.out.println("Interest (Current Account): 0");
    }
}

public class bankMain {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.initializeValues("SA001", "Savings", 5000);
        savingsAccount.displayValues();
        savingsAccount.calculateInterest();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.initializeValues("CA001", "Current", 10000);
        currentAccount.displayValues();
        currentAccount.calculateInterest();
    }
}
