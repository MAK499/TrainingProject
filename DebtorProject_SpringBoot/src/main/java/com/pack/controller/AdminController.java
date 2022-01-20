package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.dao.AdminDao;
import com.pack.model.TransactionDetails;

@Controller
public class AdminController

{

	@Autowired
	AdminDao adao;
	
	@RequestMapping("pages/authorize")
	public String authorize(@RequestParam("debtor_id") int id,@RequestParam("action")String action,@RequestParam("rjreason")String rjreason)
	{
		TransactionDetails td = new TransactionDetails();
		td.setDebtor_id(id);
		if(action.equals("authorize"))
		{
		System.out.println(action);
		td.setStatus("A");
		td.setTransaction_info("Approved By Admin");
		}
		else
		{
			System.out.println(action);
			td.setStatus("R");
			td.setTransaction_info(rjreason);
		}
		
		int i = adao.authorize(td);
		if(i>0)
		{
			
		return "Welcomeadmin";
		}
		else
		{
			System.out.println("Auth Error");
			return null;
		}
	}
	
	/*@RequestMapping("pages/reject")
	public String reject(@RequestParam("debtor_id") int id)
	{
		TransactionDetails td = new TransactionDetails();
		td.setDebtor_id(id);
		td.setStatus("A");
		td.setTransaction_info("Approved By Admin");
		int i = adao.authorize(td);
		if(i>0)
		{
		return "Welcomeadmin";
		}
		else
		{
			System.out.println("Auth Error");
			return null;
		}
	}*/
	
	
}
