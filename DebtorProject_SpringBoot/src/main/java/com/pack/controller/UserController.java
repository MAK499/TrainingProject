package com.pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.pack.dao.UserDao;
import com.pack.model.User;

@Controller
public class UserController 
{

	@Autowired
	UserDao udao;
	
	
	
	@RequestMapping(value = "pages/corporateLogin" ,method = RequestMethod.POST)
	public String corporateLogin(@ModelAttribute User user)
	{
		
		int i = udao.corporateLogin(user);
		System.out.println("i value is :"+i);
		if(i>0)
		{
		return "corporate-success";
		}
		else
		{
			return "corporate-error";
		}
	}
	
	@RequestMapping(value = "pages/adminLogin" ,method = RequestMethod.POST)
	public String adminLogin(@ModelAttribute User user)
	{
		
		int i = udao.adminLogin(user);
		System.out.println("i value is :"+i);
		if(i>0)
		{
		return "admin-success";
		}
		else
		{
			return "admin-error";
		}
	}
	
	
	@RequestMapping(value = "pages/newUser",method =RequestMethod.POST)
	public String newUser(@ModelAttribute User user)
	{
		int i = udao.addUser(user);
		System.out.println("i value is :"+i);
		if(i>0)
		{
		return "user-success";
		}
		else
		{
			return "user-error";
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
