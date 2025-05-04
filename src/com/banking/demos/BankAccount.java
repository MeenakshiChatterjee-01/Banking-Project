package com.banking.demos;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        addTransaction("Deposit", amount);
    }

    public abstract void withdraw(double amount);

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void addTransaction(String type, double amount) {
        transactions.add(new Transaction(type, amount));
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}
