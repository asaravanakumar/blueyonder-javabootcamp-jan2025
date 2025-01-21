package com.blueyonder.bankingapp;

import com.blueyonder.bankingapp.exception.AccountException;
import com.blueyonder.bankingapp.model.Account;
import com.blueyonder.bankingapp.model.AccountType;
import com.blueyonder.bankingapp.service.AccountService;
import com.blueyonder.bankingapp.service.AccountServiceArrImpl;

import java.util.Scanner;

public class BankingAppMain {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Create Account Service instance with Array Impl
        AccountService accService = new AccountServiceArrImpl();


        // TODO: Show the menu
        System.out.println("Welcome to the BankingApp!!!");
        do {
        System.out.println("1. Add Account");
        System.out.println("2. View All Accounts");
        System.out.println("3. View Account");
        System.out.println("4. Update Account");
        System.out.println("5. Delete Account");
        System.out.println("6. Exit");

        System.out.print("Enter the option: ");
        int option = in.nextInt();
        in.skip("\n");

            switch (option) {
                case 1:
                    Account account = captureAccountDetails();
                    int id = accService.createAccount(account);
                    System.out.println("Account created successfully. Account ID - " + id);
                    break;
                case 2:

                    Account[] accounts = accService.getAllAccounts();
                    if(accounts.length == 0) {
                        System.out.println("No Accounts Found.");
                    }
                    for (Account acc : accService.getAllAccounts()) {
                        System.out.println(acc);
                    }
                    break;
                case 3:
                    System.out.println("Enter account id: ");
                    int accId = in.nextInt();
                    Account acc = null;
                    try {
                        acc = accService.getAccount(accId);
                        System.out.println(acc);
                    } catch (AccountException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Account update - To be implemented");
                    break;
                case 5:
                    System.out.println("Account Delete - To be implemented");
                    break;
                case 6:
                    System.out.println("Thank You!!!");
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        }while(true);

        // TODO: Get input from user

        // TODO: Perform appropriate operation
    }

    private static Account captureAccountDetails() {
        Account account = new Account();
        System.out.print("Enter Account Name:");
//        in.next();
        account.setName(in.nextLine());
        System.out.print("Enter Balance Amount: ");
        account.setBalance(in.nextDouble());
//        System.out.print("Enter Account:");
//        in.next();
        account.setType(AccountType.SAVINGS);

        return account;
    }
}
