package com.capgemini.pecunia.bean;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "transaction")
@XmlRootElement
public class Transaction 
{
	@Id
	@Column(name="trans_id")
	private long transactionId;
	@Column(name="account_id")
	private long accId;
	@Column(name="type")
	private String type;
	@Column(name="amount")
	private double amount;
	@OneToOne
	@JoinColumn(name="cheque_id")
	private Cheque cheque;
	@Column(name="date_of_trans")
	private LocalDate dateOfTrans;
	public Transaction() 
	{
	}
	public Transaction(int transactionId, int accId, String type, double amount, Cheque cheque, LocalDate dateOfTrans) 
	{
		this.transactionId = transactionId;
		this.accId = accId;
		this.type = type;
		this.amount = amount;
		this.cheque = cheque;
		this.dateOfTrans = dateOfTrans;
	}
	public long getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}
	public long getAccId() {
		return accId;
	}
	public void setAccId(long l) {
		this.accId = l;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Cheque getCheque() {
		return cheque;
	}
	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	public LocalDate getDateOfTrans() {
		return dateOfTrans;
	}
	public void setDateOfTrans(LocalDate dateOfTrans) {
		this.dateOfTrans = dateOfTrans;
	}
}
