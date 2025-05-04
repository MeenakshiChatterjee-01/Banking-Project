package com.banking.demos;
public class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100;
    private static final double INTEREST_RATE = 0.03; // 3% annual interest

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            deposit(-amount);
        } else {
            System.out.println("Insufficient funds. Minimum balance of $100 required.");
        }
    }

    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        deposit(interest);
        System.out.println("Interest of $" + interest + " added to account.");
    }
}
