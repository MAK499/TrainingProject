package com.pack.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pack.model.User;

@Repository
public class UserDao implements UserDaoInterface

{
	@Autowired
	DataSource dataSource;

	@Override
	public int corporateLogin(User user) {
		int status=0;
		try {
		Connection con = MySqlConn.getCon();
		String u = user.getEmail();
		String p = user.getPassword();
		System.out.println(u+" | "+p);
	    java.sql.Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery("select * from user where email='"+u+"' and password='"+p+"' and user_type='corporate' ");
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
		

	@Override
	public int adminLogin(User user) {
		int status=0;
		try {
		Connection con = MySqlConn.getCon();
		String u = user.getEmail();
		String p =user.getPassword();
		System.out.println(u+" | "+p);
	    java.sql.Statement st = con.createStatement();
	    ResultSet rs = st.executeQuery("select * from user where email='"+u+"' and password='"+p+"' and user_type='admin' ");
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

	@Override
	public int addUser(User u) {
		int status=0;
		JdbcTemplate obj = new JdbcTemplate(dataSource);
		String sql = "insert into user(name,email,password,user_type)  values(?,?,?,?)";
		status=obj.update(sql,u.getName(),u.getEmail(),u.getPassword(),u.getUtype());
		System.out.println("User Created");
		return status;
	}
	
	
}
