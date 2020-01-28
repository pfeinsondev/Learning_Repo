import java.util.*;

public class BankAccount {
    // Instance variables
    private String accountNumber;
    private double checkingBalance, savingsBalance;
    // Static class variables
    private static int numAccountsCreated = 0;
    private static double vaultTotal = 0.0; 
    // Constructor
    public BankAccount() {
        accountNumber = generateAccountNumber() + "";
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        ++numAccountsCreated;
    }
    
    // Deposits
    public void deposit(String accountType, double depositAmount) {
        if (accountType.equals("Savings")) { savingsBalance += depositAmount; vaultTotal += depositAmount; }
        else if (accountType.equals("Checking")) { checkingBalance += depositAmount; vaultTotal += depositAmount; }
    }
    
    // Withdraw
    public boolean withdraw(String accountType, double amount) {
        if (accountType.equals("Savings")) { 
            if (savingsBalance >= amount) { savingsBalance -= amount; vaultTotal -= amount; return true; }
                else { return false; }
        } else if (accountType.equals("Checking")) {
            if (checkingBalance >= amount) { checkingBalance -= amount; vaultTotal -= amount; return true; }
                else {return false; }
        } else { return false; }
    }
    
    // Observers
    public double getCheckingBalance() { return checkingBalance; }
    public double getSavingsBalance() { return savingsBalance; }
    public double getCombinedBalance() { return checkingBalance + savingsBalance; }
    public String getAccountNumber() { return accountNumber; }
    
    // Static methods (Utility methods)
    public static int getNumAccounts() { return numAccountsCreated; }
    public static double getVaultTotal() { return vaultTotal; }
    
    public static int generateAccountNumber() {
        Random rand = new Random();
        int accountNum = 0;
        for (int i = 0; i < 10; ++i) { accountNum += rand.nextInt(10)*Math.pow(10, i); }
        return accountNum;
    }
}
