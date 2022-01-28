package com.pack.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.DebtorDetails;
import com.pack.model.TransactionDetails;
import com.pack.repository.TransactionRepository;

@Service
public class TransactionService
{
    @Autowired
	TransactionRepository tranRepository;
    
    public void saveTransaction(DebtorDetails db)
    {
    	
    	TransactionDetails td = new TransactionDetails();
    	
    	Random r = new Random();
    	int tnum = r.nextInt(99999);
    	
     LocalDate localDate = LocalDate.now();
   	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
   	 String formattedString = localDate.format(formatter);
   	 System.out.println(formattedString);
    	
    	
    	
    	td.setDebtor_id(db.getDebtor_id());
    	td.setTransaction_num(tnum);
    	td.setTransaction_date(formattedString);
    	td.setStatus("P");
    	td.setTransaction_info("Awaiting Approval From Admin");
    	
    	
    	tranRepository.save(td);
    }
	
}
