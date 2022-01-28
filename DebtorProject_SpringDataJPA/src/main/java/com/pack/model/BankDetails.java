package com.pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bank_details")
public class BankDetails 
{



@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="debtor_id")
int debtorid;

@Column(name="bank_name")
String bank_name;

@Column(name="branch_name")
String branch_name;

@Column(name="IFSC")
String IFSC;

@Column(name="acc_currency")
String currency;

@Column(name="acc_no")
String accnum;


public int getDebtorid() {
	return debtorid;
}
public void setDebtorid(int debtorid) {
	this.debtorid = debtorid;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public String getBranch_name() {
	return branch_name;
}
public void setBranch_name(String branch_name) {
	this.branch_name = branch_name;
}
public String getIFSC() {
	return IFSC;
}
public void setIFSC(String iFSC) {
	IFSC = iFSC;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getAccnum() {
	return accnum;
}
public void setAccnum(String accnum) {
	this.accnum = accnum;
}


/*public BankDetails(int debtorid, String bank_name, String branch_name, String iFSC, String currency, String accnum) {
	super();
	this.debtorid = debtorid;
	this.bank_name = bank_name;
	this.branch_name = branch_name;
	IFSC = iFSC;
	this.currency = currency;
	this.accnum = accnum;
}*/


















}
