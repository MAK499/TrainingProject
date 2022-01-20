package com.pack.dao;

import java.util.Random;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.TransactionDetails;

@Repository
public class TransactionDao implements TransactionDaoInterface
{

	@Autowired
	DataSource dataSource;
	
	@Override
	public int save(TransactionDetails td)
	{
		int status=0;
	    Random r = new Random();
		int tnum = r.nextInt(99999);
		td.setTransaction_num(tnum);
		
		JdbcTemplate obj = new JdbcTemplate(dataSource);
		String sql = "insert into transaction_details values (last_insert_id(),?,curdate(),'P','Awaiting Approval From Admin')";
		status=obj.update(sql,td.getTransaction_num());
        System.out.println("Transaction Details Added");
		return status;
	}

}
