package com.jju;


public class CheckingAccount extends BankAccount {
    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalDeduction = amount + TRANSACTION_FEE;
        // Logic: Only withdraw if the balance covers the amount + the fee
        if (amount > 0 && balance >= totalDeduction) {
            super.withdraw(totalDeduction); 
        }
    }
}
