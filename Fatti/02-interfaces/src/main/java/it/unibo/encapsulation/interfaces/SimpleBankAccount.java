package it.unibo.encapsulation.interfaces;

public class SimpleBankAccount implements BankAccount {

    
    private double balance;
    private int transactions = 0; 
    private static double ATM_TRANSACTION_FEE = 1;
    private final int id;

    // costructor
    public SimpleBankAccount(final int id, final double balance) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    } 

    public int getTransactionsCount() {
        return this.transactions;
    }

    public double getBalance() {
        return this.balance;
    }

    private void transacionOp(final double amount) {
        this.transactions++;
        this.balance += amount;
    }

    public void deposit(final int id, final double amount) {
        if (getId() == id) {
            this.transacionOp(amount);
        }
    }

    public void withdraw(final int id, final double amount) {
        if(getId() == id) {
            this.transacionOp(-amount);
        }
    }

    public void depositFromATM(final int id, final double amount) {
        if(getId() == id) {
            this.transacionOp(amount-ATM_TRANSACTION_FEE);
        }
    }

    public void withdrawFromATM(final int id, final double amount) {
        if(getId() == id) {
            this.transacionOp(-(amount+ATM_TRANSACTION_FEE));
        } 
    }

    public void chargeManagementFees(final int id) {

    }
}
