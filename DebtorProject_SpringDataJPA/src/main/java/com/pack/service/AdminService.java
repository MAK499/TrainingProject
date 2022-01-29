package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.TransactionDetails;
import com.pack.repository.AdminRepository;

@Service
public class AdminService
{

    @Autowired	
	AdminRepository adminRepository;
    
    public void authorize(TransactionDetails td)
    {
    	adminRepository.authorize(td.getStatus(), td.getTransaction_info(),td.getTransaction_date(), td.getDebtor_id());
    	System.out.println(td.getStatus()+" | "+td.getTransaction_info()+" | "+td.getDebtor_id()+" | "+td.getTransaction_date());
    	
    }
	
}
