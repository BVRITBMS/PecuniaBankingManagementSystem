 package com.capg.pecunia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.pecunia.entity.PassbookBean;
import com.capg.pecunia.exception.AccountNotFoundException;
import com.capg.pecunia.service.PassbookServiceImpl;

@RestController
@RequestMapping(value = "/account")
@CrossOrigin("http://localhost:4200")
public class PassbookRestController {
	@Autowired
	private PassbookServiceImpl service;
	
	/*@Author:Ashwini
	 * In Postman we use the url as http://localhost:8085/account/create and select
	 * as POST
	 
	
	this method is used to create an account in which values comes from service layer*/

	@PostMapping(path = "/create")
	public ResponseEntity<Boolean> createAccount(@RequestBody PassbookBean bean) {
		service.createAccount(bean);
		ResponseEntity<Boolean> responseEntity = new ResponseEntity(true, HttpStatus.OK);
		System.out.println("response entity=" + responseEntity);
		return responseEntity;
	}
	
	
	/*
	 * In postman we use the url as http://localhost:8085/account/getdetails/{id}
	 * this method is used to identify the particular customer details which comes
	 * from service layer
	 */

	@GetMapping(path = "/getdetails/{id}")
	public ResponseEntity<PassbookBean> findById(@PathVariable("id") long id) throws AccountNotFoundException {
		PassbookBean bean = service.findById(id);
		if (bean == null) {
			throw new AccountNotFoundException("account not found for number=" + id);
		}
		return new ResponseEntity<PassbookBean>(bean, new HttpHeaders(), HttpStatus.OK);
	}
	
	
	/*
	 * In Postman we used the url as http://localhost:8085/account/update/{id} this
	 * method is used to update the customer transaction details which comes from
	 * HistoryBean
	 * 
	 */	

	@PutMapping(path = "/update/{id}")
	public ResponseEntity<PassbookBean> updatePassbook(@RequestBody PassbookBean bean) {
		bean = service.updatePassbook(bean);
		return new ResponseEntity<PassbookBean>(bean, new HttpHeaders(), HttpStatus.OK);
	}
	
	/*
	 * In Postman we use the url as http://localhost:8085/account/bank/findall This
	 * method will retrieve all the details of the customer's in which values comes
	 * from service layer
	 */	@GetMapping("/bank/findall")   	public List<PassbookBean> getall() {

		List<PassbookBean> bean = service.getAll();
		return bean;
	}

	/*
	 * @ExceptionHandler(Exception.class) public String inValid(Exception e) {
	 * return e.getMessage(); }
	 */

}































