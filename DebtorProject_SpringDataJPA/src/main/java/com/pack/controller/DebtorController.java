package com.pack.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.exception.CustomException;
import com.pack.model.BankDetails;
import com.pack.model.DebtorDetails;
import com.pack.service.BankService;
import com.pack.service.DebtorService;
import com.pack.service.TransactionService;

//import ch.qos.logback.classic.Logger;


@Controller
public class DebtorController 
{

	final static Logger logger = LogManager.getLogger(DebtorController.class);
	
	@Autowired
    DebtorService debtorService;	
	
	@Autowired
	BankService bankService;
	
	@Autowired
	TransactionService tranService;
	
	
	@RequestMapping("/pages/addDebtor")
	public String addDebtor( @ModelAttribute DebtorDetails db,@ModelAttribute BankDetails bnk,Model m)
	{
	
		try
		{
		
		//db=null;
		
	    if(db==null | bnk==null)
        {
        	throw new CustomException();
        }
			
		logger.info("Debtor Details Are Added");
        debtorService.saveDebtor(db);
        
        logger.info("Bank Details Are Added");
        bankService.saveBank(bnk,db);
        
        logger.info("Transaction Details Added");        
        tranService.saveTransaction(db);
        
    
        
        return "Transaction";
	}
		catch (CustomException e)
		{
			System.out.println("Custom Exception is Triggered");
			e.printStackTrace();
			m.addAttribute("exception",e);
			return "exception";

		}
		
	
 
	}
	
    /*@ExceptionHandler(value = Exception.class)
	public String ExceptionHandler(Model m)
	{
    	System.out.println("Exception is Triggered");
		return "exception";
	}*/
}
