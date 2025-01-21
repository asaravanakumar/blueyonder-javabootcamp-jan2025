package com.labs.java.oops;

import java.util.Objects;

public abstract class Account {
    private int id;
    private String name;
    private double balance;
    private boolean active;

    public Account() {
        System.out.println("Account default constructor");
    }


    public Account(int id, String name, double balance, boolean active) {
        System.out.println("Account overloaded constructor");
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    

    public void openAccount() {
        System.out.println("Opening com.labs.java.oops.Account..");
        this.active = true;
    }

    public void closeAccount() {
        System.out.println("Closing com.labs.java.oops.Account...");
        this.active = false;
    }

    public abstract double calculateBalance();

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", active=" + active +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Account account)) return false;
        return id == account.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
