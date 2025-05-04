package com.banking.demos;
import java.time.LocalDate;

public class Transaction {
    private String type; // "Deposit" or "Withdrawal"
    private double amount;
    private String date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = LocalDate.now().toString();
    }

    @Override
    public String toString() {
        return date + ": " + type + " of Rs." + amount;
    }
}
