package com.pack.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.TransactionDetails;

@Repository
public class AdminDao implements AdminDaoInterface

{

	@Autowired
	DataSource dataSource;
	
	@Override
	public int authorize(TransactionDetails td) 
	{
		int status=0;
		JdbcTemplate obj = new JdbcTemplate(dataSource);
		String sql = "update transaction_details set transaction_status=?,transaction_date=curdate(),transaction_info=? where debtor_id=?";
		status=obj.update(sql,td.getStatus(),td.getTransaction_info(),td.getDebtor_id());
		System.out.println("Authorized");
		return status;
	}

}
