package com.pack.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.BankDetails;

@Repository
public class BankDao implements BankDaoInterface

{

	@Autowired
	DataSource dataSource;

	@Override
	public int save(BankDetails bnk) 
	{
		int status=0;
		JdbcTemplate obj = new JdbcTemplate(dataSource);
		String sql = "insert into bank_details values  (last_insert_id(),?,?,?,?,?)";
		status=obj.update(sql,bnk.getBank_name(),bnk.getBank_name(),bnk.getIFSC(),bnk.getAccnum(),bnk.getCurrency());
		System.out.println("Bank Data Inserted");
		return status;
	}
	
	
}
