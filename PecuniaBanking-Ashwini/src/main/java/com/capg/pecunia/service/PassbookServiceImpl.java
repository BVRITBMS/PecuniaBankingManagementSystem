package com.capg.pecunia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.pecunia.dao.IPassbookDao;

import com.capg.pecunia.entity.PassbookBean;

@Service
public class PassbookServiceImpl implements IPassbookService {

	@Autowired
	IPassbookDao dao;

	/*
	 * 
	 * this method controller request will come to service to this createAccount method
	 * From createAccount method it goes to dao.createAccount
	 * dao is the object reference of the Dao class and createAccount is the method
	 
	 */

	@Override
	public PassbookBean createAccount(PassbookBean bean) {

		String str = String.valueOf(bean);
		if (str.matches("[1-9]{1}[0-9]{11}")) {

		} else
			try {
				throw new Exception("Invalid account number");
			} catch (Exception e) {

				e.printStackTrace();
			}

		return dao.createAccount(bean);
	}

	/*
	 * 
	 * this method controller request will come to service to this findById method
	 * From findById method it goes to dao.findById
	 * dao is the object reference of the Dao class and findById is the method
	 
	 */

	@Override
	public PassbookBean findById(long id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	/*
	 * 
	 * this method controller request will come to service to this updatePassbook method
	 * From updatePassbook method it goes to dao.updatePassbook
	 * dao is the object reference of the Dao class and updatePassbook is the method
	 
	 */


	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {

		// TODO Auto-generated method stub
		return dao.updatePassbook(bean);
	}

	/*
	 * 
	 * this method controller request will come to service to this getAll method
	 * From getAll method it goes to dao.createAccount
	 * dao is the object reference of the Dao class and getAll is the method
	 
	 */

	@Override
	public List<PassbookBean> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
