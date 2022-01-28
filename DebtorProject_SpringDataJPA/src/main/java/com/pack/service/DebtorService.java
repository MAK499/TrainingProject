package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.DebtorDetails;
import com.pack.repository.DebtorRepository;

@Service
public class DebtorService
{
    @Autowired
	DebtorRepository debtorRepository;
    
    
    public void saveDebtor(DebtorDetails db)
    {
    	debtorRepository.save(db);
    }
    
	
}
