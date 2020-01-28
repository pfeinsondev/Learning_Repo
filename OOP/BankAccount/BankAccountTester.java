public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount testBankAccount = new BankAccount();
        // Bank Account formatted output (To get full status)
        System.out.printf("%-20s%25s%n%-20s%25.2f%n%-20s%25.2f%n", 
            "Account Number:", testBankAccount.getAccountNumber(), "Checking Balance:", testBankAccount.getCheckingBalance(), "Savings Balance:" ,testBankAccount.getSavingsBalance());
        BankAccount testBankAccount2 = new BankAccount();
        // Deposits
        testBankAccount.deposit("Savings", 2000.0);
        testBankAccount.deposit("Checking", 150.00);
        System.out.println();        
        // Formated output
        System.out.printf("%-20s%25s%n%-20s%25.2f%n%-20s%25.2f%n", 
            "Account Number:", testBankAccount.getAccountNumber(), "Checking Balance:", testBankAccount.getCheckingBalance(), "Savings Balance:" ,testBankAccount.getSavingsBalance());
        System.out.println();
        // Static tests
        System.out.println("Total Accounts Created: " + testBankAccount.getNumAccounts());
        System.out.println("Total Amount in vault: " + testBankAccount.getVaultTotal());
        System.out.println();
        // Withdrawal test (valid)
        if (testBankAccount.withdraw("Checking", 15)) { System.out.println("Succesful withdrawal!"); }
            else { System.out.println("Should be valid, fix this"); }
        // Withdrawal test (invalid)
        if (testBankAccount2.withdraw("Checking", 150)) { System.out.println("Shouldn't work... fix this"); }
            else { System.out.println("Working as intended, withdrawal failed"); }
        System.out.println();
        // Formated output
        System.out.printf("%-20s%25s%n%-20s%25.2f%n%-20s%25.2f%n", 
            "Account Number:", testBankAccount.getAccountNumber(), "Checking Balance:", testBankAccount.getCheckingBalance(), "Savings Balance:" ,testBankAccount.getSavingsBalance());
        System.out.println();
        System.out.printf("%-20s%25.2f%n", "Combined Total: ", testBankAccount.getSavingsBalance() + testBankAccount.getCheckingBalance());
    }
}
