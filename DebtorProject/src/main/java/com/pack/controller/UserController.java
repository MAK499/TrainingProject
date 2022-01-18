package com.pack.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.UserDao;
import com.pack.model.User;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }
     UserDao udao = new UserDao();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String action=request.getParameter("action");
		System.out.println(action);
		switch(action)
		{
		case "corporate_login":
			corporateLogin(request,response);
			break;
		case "admin_login":
			adminLogin(request,response);
			break;
		case "add_user":
			addUser(request,response);
			break;
		}
	}

	protected void corporateLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		User u = new User();
		u.setEmail(request.getParameter("email"));
		u.setPassword(request.getParameter("password"));
		int i = udao.corporateLogin(u.getEmail(), u.getPassword());
		if(i>0)
		{
			RequestDispatcher rd =  request.getRequestDispatcher("corporate-success.jsp");
			rd.forward(request, response);
		}
		else
		{
			
			request.setAttribute("name","yo");
			RequestDispatcher rd =  request.getRequestDispatcher("corporate-error.jsp");
			rd.forward(request, response);
		}
	}
	
	protected void adminLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	
		{
			User u = new User();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			int i = udao.adminLogin(u.getEmail(), u.getPassword());
			if(i>0)
			{
				
				RequestDispatcher rd =  request.getRequestDispatcher("admin-success.jsp");
				rd.forward(request, response);
			}
			else
			{
				RequestDispatcher rd =  request.getRequestDispatcher("admin-error.jsp");
				rd.forward(request, response);
			}
		}
	
	protected void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		User  u1=new User();
		
		u1.setName(request.getParameter("name"));
		u1.setEmail(request.getParameter("email"));
		u1.setPassword(request.getParameter("password"));
		u1.setUtype(request.getParameter("user_type"));
				 
		
		  int i=udao.addUser(u1);
		  if(i>0)
		  { 
			    RequestDispatcher rd =  request.getRequestDispatcher("user-success.jsp");
				rd.forward(request, response);
		  }
		  else
		  {
			  RequestDispatcher rd =  request.getRequestDispatcher("user-error.jsp");
				rd.forward(request, response);
			  }
		  
		  }
	
	
	
	
	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
