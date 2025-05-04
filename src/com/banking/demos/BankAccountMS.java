package com.banking.demos;
public class BankAccountMS {
    public static void main(String[] args) {
        BankService bankService = new BankService();
        boolean running = true;

        while (running) {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Delete Account");
            System.out.println("6. Print Account Statement");
            System.out.println("7. Exit");

            int choice = InputUtils.getInt("Choose an option: ");
            InputUtils.getString(""); // Consume newline

            switch (choice) {
                case 1:
                    String accountType = InputUtils.getString("Enter account type (Savings/Current): ");
                    String accountNumber = InputUtils.getString("Enter account number: ");
                    String accountHolderName = InputUtils.getString("Enter account holder name: ");
                    double initialBalance = InputUtils.getDouble("Enter initial balance: ");
                    if (accountType.equalsIgnoreCase("Savings")) {
                        bankService.createAccount(new SavingsAccount(accountNumber, accountHolderName, initialBalance));
                    } else if (accountType.equalsIgnoreCase("Current")) {
                        bankService.createAccount(new CurrentAccount(accountNumber, accountHolderName, initialBalance));
                    } else {
                        System.out.println("Invalid account type.");
                    }
                    break;
                case 2:
                    accountNumber = InputUtils.getString("Enter account number: ");
                    double depositAmount = InputUtils.getDouble("Enter amount to deposit: ");
                    bankService.deposit(accountNumber, depositAmount);
                    break;
                case 3:
                    accountNumber = InputUtils.getString("Enter account number: ");
                    double withdrawAmount = InputUtils.getDouble("Enter amount to withdraw: ");
                    bankService.withdraw(accountNumber, withdrawAmount);
                    break;
                case 4:
                    accountNumber = InputUtils.getString("Enter account number: ");
                    bankService.showBalance(accountNumber);
                    break;
                case 5:
                    accountNumber = InputUtils.getString("Enter account number: ");
                    bankService.deleteAccount(accountNumber);
                    break;
                case 6:
                    accountNumber = InputUtils.getString("Enter account number: ");
                    bankService.printAccountStatement(accountNumber);
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
