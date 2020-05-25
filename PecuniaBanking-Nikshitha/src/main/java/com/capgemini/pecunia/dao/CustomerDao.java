package com.capgemini.pecunia.dao;

import java.util.List;

import com.capgemini.pecunia.bean.Customerdata;

public interface CustomerDao {

	Customerdata addCustomer(Customerdata c);
	

	List<Customerdata> getAllCustomers();

	Customerdata deleteCustomer(int customerId);

	Customerdata updateCustomer(Customerdata c);

	
	
}
