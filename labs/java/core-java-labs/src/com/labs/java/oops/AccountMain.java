package com.labs.java.oops;

public class AccountMain {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.setId(123);
        savings.setName("Adarsh");
        savings.setBalance(50000.0);

        System.out.println(savings.calculateBalance());

        savings.deposit(10000.0);
        savings.withdraw(5000.0);

        double balance = savings.calculateBalance();
        System.out.println(balance);

        System.out.println(savings);
        System.out.println(savings.hashCode());

        SavingsAccount savings1 = new SavingsAccount(105, "Yogesh", 75000.0, true, 7.5);
        System.out.println(savings1.calculateBalance());
        System.out.println(savings1);
        System.out.println(savings1.hashCode());

        DepositAccount depositAcc = new DepositAccount(110, "Aviral", 100000.0, true, 8.5, 2);
        System.out.println(depositAcc);

        System.out.println(depositAcc.calculateBalance());
        depositAcc.preClose();
    }
}
