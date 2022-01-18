package com.pack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import com.pack.model.User;

public class UserDao
{
public int corporateLogin(String email, String password)
{
	int status=0;
	try{
		Connection con=MySqlConn.getCon();
		String u=email;
		String p=password;
		Statement st=con.createStatement();
		System.out.println(u+" "+p);
		ResultSet rs=st.executeQuery("select * from user where email='"+u+"' and password='"+p+"' and user_type='corporate' "); 
	
		if(rs.next())
		{
			status=1;
		}
		else
		{
			status=0;
		}
	}
	catch(Exception e){System.out.println(e);}
	return status;
}

public int adminLogin(String email, String password)
{
	int status=0;
	try{
		Connection con=MySqlConn.getCon();
		String u=email;
		String p=password;
		Statement st=con.createStatement();
		System.out.println(u+" "+p);
		ResultSet rs=st.executeQuery("select * from user where email='"+u+"' and password='"+p+"' and user_type='admin' "); 
	
		if(rs.next())
		{
			status=1;
		}
		else
		{
			status=0;
		}
	}
	catch(Exception e){System.out.println(e);}
	return status;
}

public   int addUser(User u){
	int status=0;
	try{
		Connection con=MySqlConn.getCon();
		PreparedStatement ps=con.prepareStatement("insert into user(name,email,password,user_type)  values(?,?,?,?)");
	 
		ps.setString(1,u.getName());
	 	ps.setString(2,u.getEmail());
		ps.setString(3,u.getPassword());
		ps.setString(4,u.getUtype());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}


























