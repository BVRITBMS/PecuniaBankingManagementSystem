package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.bean.Account;

public interface AccountDao {

	Account deleteByAccountnum(int accountNumber);

	List<Account> getAllAccount();

	Account getAccountByAccnum(long l);

	Account accountCreation(Account ac);

	Account update(Account ac);
}
