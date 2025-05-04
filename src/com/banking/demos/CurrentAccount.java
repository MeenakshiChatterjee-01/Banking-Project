package com.banking.demos;

public class CurrentAccount extends BankAccount {
    private static final double OVERDRAFT_LIMIT = -500.0;

    public CurrentAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= OVERDRAFT_LIMIT) {
            deposit(-amount);
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }
}
