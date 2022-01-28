package com.pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.model.BankDetails;
import com.pack.model.DebtorDetails;
import com.pack.repository.BankRepository;

@Service
public class BankService
{

	@Autowired
	BankRepository bankRepository;
	
	public void saveBank(BankDetails bnk,DebtorDetails db)
	{
		bnk.setDebtorid(db.getDebtor_id());
		bankRepository.save(bnk);
	}
	
}
