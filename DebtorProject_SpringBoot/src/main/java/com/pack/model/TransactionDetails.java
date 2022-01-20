package com.pack.model;

public class TransactionDetails
{
String transaction_date,status,transaction_info;
int debtor_id;
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
int transaction_num;
}
