package com.pack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.junit.jupiter.api.Assertions;

import com.pack.model.BankDetails;
import com.pack.model.DebtorDetails;
import com.pack.model.TransactionDetails;
import com.pack.repository.BankRepository;
import com.pack.repository.DebtorRepository;
import com.pack.repository.TransactionRepository;



@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class DebtorRepositoryTest {

	@Autowired
	DebtorRepository debtorRepository;
	
	@Autowired
	BankRepository bankRepository;
	
	@Autowired
	TransactionRepository transactionRepository;
	
	static DebtorDetails db;
	static BankDetails bnk = new BankDetails();
	static TransactionDetails tx=new TransactionDetails(); ;
	static int id;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception 
	{
		db= new DebtorDetails("Microsoft", "gachibowli", "Hyderabad", "a@microsoft.com", "04012345678", "9876543210");
		bnk.setDebtorid(id);bnk.setBank_name("ICICI");bnk.setBranch_name("HiTech City");bnk.setIFSC("ICIC1234567");bnk.setCurrency("INR");bnk.setAccnum("12345678901");
		tx.setDebtor_id(id);tx.setTransaction_num(12345);tx.setStatus("P");tx.setTransaction_date("2022-01-30");tx.setTransaction_info("Some Info");
		
		
	
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@Test
	public void saveDebtorTest()
	{
		debtorRepository.save(db);
		System.out.println(db.getDebtor_id());
		id=db.getDebtor_id();
		
		//Check For Null Values
		Assertions.assertNotNull(id);
		Assertions.assertNotNull(db.getDebtor_name());
		Assertions.assertNotNull(db.getAddrline1());
		Assertions.assertNotNull(db.getAddrline2());
		Assertions.assertNotNull(db.getEmail());
		Assertions.assertNotNull(db.getFaxnum());
		Assertions.assertNotNull(db.getPhonenum());
		
	}
	
	@Test
	public void saveBankTest()
	{
		//bnk.setDebtorid(id);
		Assertions.assertNotNull(bnk.getDebtorid());
		Assertions.assertNotNull(bnk.getBank_name());
		Assertions.assertNotNull(bnk.getBranch_name());
		Assertions.assertNotNull(bnk.getIFSC());
		Assertions.assertNotNull(bnk.getCurrency());
		Assertions.assertNotNull(bnk.getAccnum());
		
	}
	
	@Test
	public void saveTransactionTest()
	{
		Assertions.assertNotNull(tx.getDebtor_id());	
		Assertions.assertNotNull(tx.getTransaction_num());
		Assertions.assertNotNull(tx.getTransaction_date());
		Assertions.assertNotNull(tx.getStatus());
		Assertions.assertNotNull(tx.getTransaction_info());
	}
	
	@Test
	public void PhoneNumTest()
	{
		Assertions.assertEquals(10,db.getPhonenum().length());
	}
	
	@Test
	public void IFSCTest()
	{
		Assertions.assertEquals(11,bnk.getIFSC().length());
	}
	
	@Test
	public void TransactionStatusTest()
	{
		if(tx.getStatus()=="A" || tx.getStatus()=="P" || tx.getStatus()=="R" )
		{
			Assertions.assertTrue(true);
		}
		else 
		{
			Assertions.assertTrue(false);
		}
	}
	
	

}
