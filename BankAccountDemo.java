class BankAccountm {
    private double balance;
    private int accountNumber;

    // Set balance and account number
    public void set(double bal, int accNum) {
        balance = bal;
        accountNumber = accNum;
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create an instance/object of the BankAccount class
        BankAccountm account = new BankAccountm();

        // Set initial balance and account number
        account.set(1000.0, 123456);

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
