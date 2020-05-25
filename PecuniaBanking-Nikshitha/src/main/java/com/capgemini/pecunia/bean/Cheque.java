package com.capgemini.pecunia.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@XmlRootElement
public class Cheque 
{
	@Id
	private int cheque_id;
	private long account_id;
	private int chequeAccountNo;
	private String chequeHolderName;
	@Column(name="bankname")
	private String bank_name;
	private String ifsc;
	private double amount;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date issued_date;
	private String status;
	public Cheque() {}
	public Cheque(int cheque_id, long account_id, int chequeAccountNo,String chequeHolderName, String bank_name, String ifsc, Date issued_date, String status) 
	{
		this.cheque_id = cheque_id;
		this.account_id = account_id;
		this.chequeAccountNo = chequeAccountNo;
		this.chequeHolderName = chequeHolderName;
		this.bank_name = bank_name;
		this.ifsc = ifsc;
		this.issued_date = issued_date;
		this.status = status;
		
	}
	public int getCheque_id() {
		return cheque_id;
	}
	public void setCheque_id(int cheque_id) {
		this.cheque_id = cheque_id;
	}
	public long getAccount_id() {
		return account_id;
	}
	public void setAccount_id(long account_id) {
		this.account_id = account_id;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public Date getIssued_date() {
		return issued_date;
	}
	public void setIssued_date(java.util.Date issueddate) {
		this.issued_date = issueddate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getChequeAccountNo() {
		return chequeAccountNo;
	}
	public void setChequeAccountNo(int chequeAccountNo) {
		this.chequeAccountNo = chequeAccountNo;
	}
	public String getChequeHolderName() {
		return chequeHolderName;
	}
	public void setChequeHolderName(String chequeHolderName) {
		this.chequeHolderName = chequeHolderName;
	}
	
	@Override
	public String toString() {
		return "Cheque [cheque_id=" + cheque_id + ", account_id=" + account_id + ", chequeAccountNo=" + chequeAccountNo
				+ ", chequeHolderName=" + chequeHolderName + ", bank_name=" + bank_name + ", ifsc=" + ifsc + ", amount="
				+ amount + ", issued_date=" + issued_date + ", status=" + status + "]";
	}
	
}
