package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pack.model.BankDetails;

public class BankDao
{
	public   int save(BankDetails bnk){
		int status=0;
		try{
			Connection con=MySqlConn.getCon();
			PreparedStatement ps = con.prepareStatement("insert into bank_details values  (last_insert_id(),?,?,?,?,?)");
			ps.setString(1,bnk.getBank_name());
		 	ps.setString(2,bnk.getBranch_name());
		 	ps.setString(3, bnk.getIFSC());
		 	ps.setString(4, bnk.getAccnum());
		 	ps.setString(5, bnk.getCurrency());

			status=ps.executeUpdate();
		}
		catch(Exception e){System.out.println(e);}
		return status;
}
}
