package com.blueyonder.bankingapp.service;

import com.blueyonder.bankingapp.exception.NoAccountFoundException;
import com.blueyonder.bankingapp.model.Account;

public class AccountServiceArrImpl implements AccountService {

    private static final int ACCOUNT_SIZE = 10;

    private Account[] accounts = new Account[ACCOUNT_SIZE];
    private static int counter = 0;

    @Override
    public int createAccount(Account account) {
        account.setId(++counter);
        accounts[counter-1] = account;
        return account.getId();
    }

    @Override
    public Account[] getAllAccounts() {

        Account[] validAccounts = new Account[counter];

        for(int i=0; i < counter; i++) {
            if(accounts[i] != null) {
                validAccounts[i] = accounts[i];
            }
        }
        return validAccounts;
    }

    @Override
    public Account getAccount(int id) throws NoAccountFoundException{
        boolean found = false;
        Account acc = null;
        for(Account account: accounts) {
            if(account != null && account.getId() == id) {
                found = true;
                acc = account;
            }
        }

        if(!found) {
            throw new NoAccountFoundException("No Account Found for given id - " + id);
        }

        return acc;
    }

    @Override
    public boolean updateAccount(int id, Account account) {
        return false;
    }

    @Override
    public boolean deleteAccount(int id) {
        return false;
    }
}
