package com.pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController 
{
   
	@GetMapping("/pages/adminLogin")
	public String adminLogin()
	{
		return "Welcomeadmin";
	}
	
	@GetMapping("/pages/corporateLogin")
	public String corporateLogin()
	{
		return "Welcome";
	}

	
}
