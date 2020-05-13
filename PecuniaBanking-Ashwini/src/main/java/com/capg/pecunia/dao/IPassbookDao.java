package com.capg.pecunia.dao;


import java.util.List;


import com.capg.pecunia.entity.PassbookBean;

/*Here we are just designing the methods which will be implemented in another layer of this package*/
public interface IPassbookDao {

	public PassbookBean createAccount(PassbookBean bean);

	
	public PassbookBean findById(long id);

	public PassbookBean updatePassbook(PassbookBean bean);
	public List<PassbookBean> getAll();
	


}












































/*
 * List<PassbookBean> findAllDetails();
 * 
 */