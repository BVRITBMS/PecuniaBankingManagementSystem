package com.capgemini.pecunia.service;

import com.capgemini.pecunia.bean.Cheque;
import com.capgemini.pecunia.bean.Transaction;

public interface DebitService {


	Transaction debitUsingCheque(Cheque cheque);

	String getbalance(int accid);

}
