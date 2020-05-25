package com.capgemini.pecunia.service;

import com.capgemini.pecunia.bean.Cheque;
import com.capgemini.pecunia.bean.Transaction;

public interface CreditService {

	Transaction creditUsingCheque(Cheque cheque);

}
