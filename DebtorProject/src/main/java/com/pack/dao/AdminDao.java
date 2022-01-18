package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.pack.model.TransactionDetails;

public class AdminDao
{

public int authorize(TransactionDetails td)
{
	int status=0;
	try{
		Connection con=MySqlConn.getCon();
		PreparedStatement ps=con.prepareStatement("update transaction_details set transaction_status=?,transaction_date=curdate(),transaction_info=? where debtor_id=?");
	 
		ps.setString(1, td.getStatus());
		ps.setString(2, td.getTransaction_info());
		ps.setInt(3, td.getDebtor_id());
		System.out.println("Debtor Id is : "+td.getDebtor_id());
		
		status=ps.executeUpdate();
	}
	catch(Exception e){System.out.println(e);}
	return status;
}


	
}
