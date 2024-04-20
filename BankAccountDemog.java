class BankAccount {
    private double balance;
    private int accountNumber;

    // Setter method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for account number
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Getter method for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit an amount to the balance
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount " + amount + " deposited successfully.");
    }

    // Method to withdraw an amount from the balance
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankAccountDemog {
    public static void main(String[] args) {
        // Create an instance of BankAccount class
        BankAccount account = new BankAccount();

        // Set initial balance and account number
        account.setBalance(1000.0);
        account.setAccountNumber(123456789);

        // Display initial balance and account number
        System.out.println("Initial Balance: " + account.getBalance());
        System.out.println("Account Number: " + account.getAccountNumber());

        // Deposit some amount
        account.deposit(500.0);

        // Display updated balance
        System.out.println("Updated Balance after deposit: " + account.getBalance());

        // Withdraw some amount
        account.withdraw(300.0);

        // Display updated balance
        System.out.println("Updated Balance after withdrawal: " + account.getBalance());

        // Trying to withdraw an amount exceeding balance
        account.withdraw(1500.0);

        // Display balance (should remain unchanged)
        System.out.println("Balance after trying to withdraw an amount exceeding balance: " + account.getBalance());
    }
}
