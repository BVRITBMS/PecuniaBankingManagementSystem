package com.capg.pecunia.service;

import java.util.List;

import com.capg.pecunia.entity.PassbookBean;

/*we are just designing the methods which will be implemented in another layer of this package
*/public interface IPassbookService {

	public PassbookBean createAccount(PassbookBean bean);

	public PassbookBean findById(long id);

	public PassbookBean updatePassbook(PassbookBean bean);
	public List<PassbookBean> getAll();
	


}



































/*
 * List<PassbookBean> findAllDetails();
 * 
 */
