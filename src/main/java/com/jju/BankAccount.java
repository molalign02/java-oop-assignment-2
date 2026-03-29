package com.jju;

public class BankAccount {
    private String accountHolder;
    protected double balance; // Accessible by subclasses

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        // Rule: No negative starting balances
        this.balance = (initialBalance < 0) ? 0.0 : initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
