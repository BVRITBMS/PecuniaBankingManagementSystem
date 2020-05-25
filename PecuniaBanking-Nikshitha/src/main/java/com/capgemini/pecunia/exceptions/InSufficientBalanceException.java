package com.capgemini.pecunia.exceptions;

public class InSufficientBalanceException extends RuntimeException {
	
	public InSufficientBalanceException(String msg)
	{
		super(msg);
	}

}
