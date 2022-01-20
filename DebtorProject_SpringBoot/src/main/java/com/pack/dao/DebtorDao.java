package com.pack.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.DebtorDetails;

@Repository
public class DebtorDao implements DebtorDaoInterface
{
	@Autowired
	DataSource dataSource;

	@Override
	public int save(DebtorDetails u) 
	
	{
		int status=0;
		JdbcTemplate obj = new JdbcTemplate(dataSource);
		String sql = "insert into debtor_details(debtor_name,addrline1,addrline2,fax_num,phone_num,email)  values(?,?,?,?,?,?)";
		status=obj.update(sql,u.getDebtor_name(),u.getAddrline1(),u.getAddrline2(),u.getFaxnum(),u.getPhonenum(),u.getEmail());
		System.out.println("Debtor Details Added");
		return status;
	}
	
	
}
