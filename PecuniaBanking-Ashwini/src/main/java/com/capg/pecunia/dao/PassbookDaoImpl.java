package com.capg.pecunia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capg.pecunia.entity.PassbookBean;

@Repository
@Transactional
public class PassbookDaoImpl implements IPassbookDao {
	
	/*
	 * EntityManager is used to access a database in a particular application
	 */
	@PersistenceContext
	EntityManager em;
    
	/*
	 * In this Dao layer, in this addAccount method is performed and it is returned
	 * to service layer
	 */
	@Override
	public PassbookBean createAccount(PassbookBean bean) {
		// TODO Auto-generated method stub
		return em.merge(bean);
	}

	/*
	 * In this Dao layer, in this findById method is performed and it is returned to
	 * service layer
	 */
	@Override
	public PassbookBean findById(long id) {
		// TODO Auto-generated method stub
		return em.find(PassbookBean.class, id);
	}

	/*
	 * In this Dao layer, in this updatePassbook method is performed and it is
	 * returned to service layer
	 * 
	 */	@Override
	public PassbookBean updatePassbook(PassbookBean bean) {
		// TODO Auto-generated method stub
		PassbookBean pass = findById(bean.getAccountNumber());
		pass.setAmount(bean.getAmount());
		pass.setCustomerName(bean.getCustomerName());

		pass = em.merge(pass);
		return pass;
	}

	/*
	 * In this Dao layer, in this getAll method is performed and it is returned to
	 * service layer
	 * 
	 */	@Override
	public List<PassbookBean> getAll() {
		TypedQuery<PassbookBean> query = em.createQuery("from PassbookBean", PassbookBean.class);
		return query.getResultList();
	}

}
