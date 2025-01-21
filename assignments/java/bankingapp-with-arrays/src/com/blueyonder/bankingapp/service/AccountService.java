package com.blueyonder.bankingapp.service;

import com.blueyonder.bankingapp.exception.AccountException;
import com.blueyonder.bankingapp.model.Account;

/**
 * Defines the operations performed on Account
 */
public interface AccountService {
    // 1. Add Account
    public int createAccount(Account account);

    // 2. View All Accounts
    public Account[] getAllAccounts();

    // 3. View Account
    public Account getAccount(int id) throws AccountException;

    // 4. Update Account
    public boolean updateAccount(int id, Account account);

    // 5. Delete Account
    public boolean deleteAccount(int id);
}
