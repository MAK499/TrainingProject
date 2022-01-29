package com.pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="debtor_details")
public class DebtorDetails 
{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "debtor_id")
int debtor_id;

@Column(name = "debtor_name")
String debtor_name;

@Column(name="addrline1")
String addrline1;

@Column(name="addrline2")
String addrline2;

@Column(name = "email")
String email;

@Column(name="fax_num")
String faxnum;

@Column(name="phone_num")
String phonenum;




@Override
public String toString() {
	return "DebtorDetails [debtor_name=" + debtor_name + ", addrline1=" + addrline1 + ", addrline2=" + addrline2
			+ ", email=" + email + ", debtor_id=" + debtor_id + ", faxnum=" + faxnum + ", phonenum=" + phonenum + "]";
}



public int getDebtor_id() {
	return debtor_id;
}
public void setDebtor_id(int debtor_id) {
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



public DebtorDetails(String debtor_name, String addrline1, String addrline2, String email, String faxnum,
		String phonenum) {
	super();
	this.debtor_name = debtor_name;
	this.addrline1 = addrline1;
	this.addrline2 = addrline2;
	this.email = email;
	this.faxnum = faxnum;
	this.phonenum = phonenum;
}

















}
