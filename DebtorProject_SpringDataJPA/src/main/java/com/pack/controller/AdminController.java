package com.pack.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pack.model.TransactionDetails;
import com.pack.service.AdminService;

@Controller
public class AdminController 
{

	final static Logger logger = LogManager.getLogger(AdminController.class);
	
	@Autowired
	AdminService adminService;
	
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
		
		 LocalDate localDate = LocalDate.now();
	   	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	   	 String formattedString = localDate.format(formatter);
	   	 td.setTransaction_date(formattedString);
		
		
		
		logger.info("Authorize Method Triggered");
		adminService.authorize(td);
		
		
		return "Welcomeadmin";
	}
	
	
}
