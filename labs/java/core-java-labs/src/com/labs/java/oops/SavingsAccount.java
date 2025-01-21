package com.labs.java.oops;

public class SavingsAccount extends Account {

    public SavingsAccount() {
//        super(123,"Yogesh",75000.0,true);
        System.out.println("SavingsAccount default constructor");

    }

    public SavingsAccount(int id, String name, double balance, boolean active, double roi) {
        super(id, name, balance, active);
        this.roi = roi;
    }

    private double roi;
    private double minBalance;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    @Override
    public double calculateBalance() {
        return this.getBalance();
    }

    public void deposit(double amount) {
        this.setBalance(this.getBalance() + amount);
    }

    public void withdraw(double amount) {
        this.setBalance(this.getBalance() - amount);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "id=" + getId() +
                ", name='" + this.getName() + '\'' +
                ", balance=" + this.getBalance() +
                ", roi=" + roi +
                ", minBalance=" + minBalance +
                '}';
    }


}
