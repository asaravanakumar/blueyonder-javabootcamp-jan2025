package com.labs.java.oops;

public class CurrentAccount extends Account {


    @Override
    public double calculateBalance() {
        return this.getBalance();
    }
}
