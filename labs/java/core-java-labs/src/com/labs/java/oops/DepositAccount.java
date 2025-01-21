package com.labs.java.oops;

public class DepositAccount extends Account implements PreCloseable {
    public DepositAccount(int id, String name, double balance, boolean active, double roi, int tenure) {
        super(id, name, balance, active);
        this.roi = roi;
        this.tenure = tenure;
    }

    private double roi;
    private int tenure;

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public double calculateBalance() {
        return this.getBalance() + (this.getBalance() * this.getRoi() * this.getTenure() / 100);
    }

    @Override
    public void preClose() {
        System.out.println("Pre-closing Deposit Account");
    }
}
