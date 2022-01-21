package com.pack.model;

public class DebtorDetails 
{
String debtor_name;
String addrline1,addrline2;
String email;
String debtor_id;
String faxnum;
@Override
public String toString() {
	return "DebtorDetails [debtor_name=" + debtor_name + ", addrline1=" + addrline1 + ", addrline2=" + addrline2
			+ ", email=" + email + ", debtor_id=" + debtor_id + ", faxnum=" + faxnum + ", phonenum=" + phonenum + "]";
}
String phonenum;


public String getDebtor_id() {
	return debtor_id;
}
public void setDebtor_id(String debtor_id) {
	this.debtor_id = debtor_id;
}
public String getDebtor_name() {
	return debtor_name;
}
public void setDebtor_name(String debtor_name) {
	this.debtor_name = debtor_name;
}
public String getAddrline1() {
	return addrline1;
}
public void setAddrline1(String addrline1) {
	this.addrline1 = addrline1;
}
public String getAddrline2() {
	return addrline2;
}
public void setAddrline2(String addrline2) {
	this.addrline2 = addrline2;
}
public String getFaxnum() {
	return faxnum;
}
public void setFaxnum(String faxnum) {
	this.faxnum = faxnum;
}
public String getPhonenum() {
	return phonenum;
}
public void setPhonenum(String phonenum) {
	this.phonenum = phonenum;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
