package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.pack.model.DebtorDetails;

public class DebtorDao 
{
	public   int save(DebtorDetails u){
		int status=0;
		try{
			Connection con=MySqlConn.getCon();
			PreparedStatement ps=con.prepareStatement("insert into debtor_details(debtor_name,addrline1,addrline2,fax_num,phone_num,email)  values(?,?,?,?,?,?)");
		 
			ps.setString(1,u.getDebtor_name());
		 	ps.setString(2,u.getAddrline1());
		 	ps.setString(3, u.getAddrline2());
		 	ps.setString(4, u.getFaxnum());
		 	ps.setString(5, u.getPhonenum());
		 	ps.setString(6, u.getEmail());

			status=ps.executeUpdate();

		}
		catch(Exception e){System.out.println(e);}
		return status;
	
	}

}
