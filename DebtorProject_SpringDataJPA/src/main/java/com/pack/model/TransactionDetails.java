package com.pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transaction_details")
public class TransactionDetails
{
	
@Id
@Column(name="debtor_id")
int debtor_id;

@Column(name="transaction_no")
int transaction_num;

@Column(name="transaction_date")
String transaction_date;

@Column(name="transaction_status")
String status;

@Column(name="transaction_info")
String transaction_info;

public int getDebtor_id() {
	return debtor_id;
}
public void setDebtor_id(int debtor_id) {
	this.debtor_id = debtor_id;
}
public String getTransaction_date() {
	return transaction_date;
}
public void setTransaction_date(String transaction_date) {
	this.transaction_date = transaction_date;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTransaction_info() {
	return transaction_info;
}
public void setTransaction_info(String transaction_info) {
	this.transaction_info = transaction_info;
}
public int getTransaction_num() {
	return transaction_num;
}
public void setTransaction_num(int transaction_num) {
	this.transaction_num = transaction_num;
}


/*public TransactionDetails(int debtor_id, int transaction_num, String transaction_date, String status,
		String transaction_info) {
	super();
	this.debtor_id = debtor_id;
	this.transaction_num = transaction_num;
	this.transaction_date = transaction_date;
	this.status = status;
	this.transaction_info = transaction_info;
}*/












}
