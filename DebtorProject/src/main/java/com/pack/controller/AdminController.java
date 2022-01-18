package com.pack.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.AdminDao;
import com.pack.model.TransactionDetails;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminController() {
        super();
       
    }
    AdminDao adao = new AdminDao();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String action=request.getParameter("action");
		System.out.println(action);
		switch(action)
		{
		case "authorize":
			authorize(request,response);
			break;
		case "reject":
			reject(request,response);
			break;	
		}
		
		
	}
	private void authorize(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		TransactionDetails td = new TransactionDetails();
		td.setDebtor_id(Integer.parseInt(request.getParameter("debtor_id")));
		td.setStatus("A");
		td.setTransaction_info("Approved By Admin");
		int i = adao.authorize(td);
		if(i>0)
		{
			System.out.println(" Details Updated");
			RequestDispatcher rd = request.getRequestDispatcher("Welcomeadmin.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			System.out.println("Auth  Error");
		}
		
	}
	
	private void reject(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		TransactionDetails td = new TransactionDetails();
		td.setDebtor_id(Integer.parseInt(request.getParameter("debtor_id")));
		td.setStatus("R");
		td.setTransaction_info(request.getParameter("rjreason"));
		int i = adao.authorize(td);
		if(i>0)
		{
			System.out.println(" Details Updated");
			RequestDispatcher rd = request.getRequestDispatcher("Welcomeadmin.jsp");
			rd.forward(request, response);
			
		}
		else
		{
			System.out.println("Reject Error");
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
