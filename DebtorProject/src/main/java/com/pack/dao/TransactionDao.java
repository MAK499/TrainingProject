package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.pack.model.TransactionDetails;

public class TransactionDao 

{
	public   int save(TransactionDetails td){
		int status=0;
		try{
			Connection con=MySqlConn.getCon();
			PreparedStatement ps = con.prepareStatement("insert into transaction_details values (last_insert_id(),?,curdate(),'P','Awaiting Approval From Admin')");
			ps.setInt(1, td.getTransaction_num());
			status=ps.executeUpdate();
		}
		catch(Exception e){System.out.println(e);}
		return status;
}
}