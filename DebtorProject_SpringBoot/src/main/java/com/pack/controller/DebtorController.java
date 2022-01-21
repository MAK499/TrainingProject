package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.dao.BankDao;
import com.pack.dao.DebtorDao;
import com.pack.dao.TransactionDao;
import com.pack.model.BankDetails;
import com.pack.model.DebtorDetails;
import com.pack.model.TransactionDetails;

@Controller
public class DebtorController 
{

	@Autowired
	DebtorDao dbdao;
	
	@Autowired
	BankDao bnkdao;
	
	@Autowired
	TransactionDao tdao;
	
	
	@RequestMapping("pages/addDebtor")
	public String addDebtor(@ModelAttribute DebtorDetails db,@ModelAttribute BankDetails bnk)
	{
		TransactionDetails td=new TransactionDetails();
        int i = dbdao.save(db);
        int j=bnkdao.save(bnk);
        int k=tdao.save(td);
        if(i>0 && j>0 && k>0)
        {
        	return "Transaction";
        }
        else
        {
        	return "error";
        }
        
	}
	
	
}
