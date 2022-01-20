package com.pack.model;

public class BankDetails 
{
@Override
	public String toString() {
		return "BankDetails [bank_name=" + bank_name + ", branch_name=" + branch_name + ", IFSC=" + IFSC + ", currency="
				+ currency + ", accnum=" + accnum + ", debtorid=" + debtorid + "]";
	}
String bank_name,branch_name,IFSC,currency,accnum;
int debtorid;

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
}
