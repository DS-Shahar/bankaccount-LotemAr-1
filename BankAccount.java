package lotem1;

public class BankAccount {
    private double balance;
    private double overdraftLimit;
    private String accountHolder;

    public BankAccount(double overdraftLimit, double initialBalance, String accountHolder) {
        this.overdraftLimit = overdraftLimit;
        this.balance = initialBalance;
        this.accountHolder = accountHolder;
    }

    public boolean transfer(BankAccount recipient, double amount) {
        if (amount <= 0) {
            return false;
        }
        if (this.balance + this.overdraftLimit >= amount) {
            this.balance -= amount;
            recipient.balance += amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return accountHolder + "'s balance: " + balance;
    }
}
