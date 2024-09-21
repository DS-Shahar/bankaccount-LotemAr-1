package lotem1;

public class Main {
    public static void main(String[] args) {
        // Creating accounts for Lisa and Bob with an initial balance of 1000 and an overdraft limit of -1000
        BankAccount lisaAccount = new BankAccount(-1000, 1000, "Lisa");
        BankAccount bobAccount = new BankAccount(-1000, 1000, "Bob");

        // Displaying initial balances
        System.out.println("Initial balances:");
        System.out.println(lisaAccount);
        System.out.println(bobAccount);

        // Transferring 500 from Lisa to Bob
        System.out.println("\nTransferring 500 from Lisa to Bob...");
        if (lisaAccount.transfer(bobAccount, 500)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed! Not enough balance.");
        }

        // Displaying balances after transfer
        System.out.println("\nBalances after transferring 500:");
        System.out.println(lisaAccount);
        System.out.println(bobAccount);

        // Attempting to transfer 1600 from Lisa to Bob
        System.out.println("\nTransferring 1600 from Lisa to Bob...");
        if (lisaAccount.transfer(bobAccount, 1600)) {
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transfer failed! Not enough balance.");
        }

        // Displaying balances after attempting to transfer 1600
        System.out.println("\nBalances after attempting to transfer 1600:");
        System.out.println(lisaAccount);
        System.out.println(bobAccount);
    }
}
