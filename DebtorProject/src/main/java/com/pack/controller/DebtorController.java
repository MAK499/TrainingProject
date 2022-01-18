package com.pack.controller;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.BankDao;
import com.pack.dao.DebtorDao;
import com.pack.dao.TransactionDao;
import com.pack.model.BankDetails;
import com.pack.model.DebtorDetails;
import com.pack.model.TransactionDetails;

@WebServlet("/DebtorController")
public class DebtorController extends HttpServlet
{
	private static final long serialVersionUID = 1L;
  
    public DebtorController() 
    {
        super();   
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String action=request.getParameter("action");
		System.out.println(action);
		switch(action)
		{
		
		case "add_debtor":
			addDebtor(request,response);
			break;
		}
	}
	
	protected void addDebtor(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		DebtorDetails dbt = new DebtorDetails();
		BankDetails bd = new BankDetails();
		TransactionDetails td = new TransactionDetails();
		debtorDetails(request,response,dbt);
		addBank(request,response,bd);
		addTransaction(request,response,td);
		RequestDispatcher rd = request.getRequestDispatcher("Transaction.jsp");
		rd.forward(request, response);
	
		}

	

	

	private void debtorDetails(HttpServletRequest request, HttpServletResponse response,DebtorDetails dbt)
	{
		DebtorDao dbdao = new DebtorDao();
		dbt.setDebtor_name(request.getParameter("debtorname"));
		dbt.setAddrline1(request.getParameter("addrline1"));
		dbt.setAddrline2(request.getParameter("addrline2"));
		dbt.setFaxnum(request.getParameter("faxno"));
		dbt.setPhonenum(request.getParameter("phone"));
		dbt.setEmail(request.getParameter("email"));
		int i=dbdao.save(dbt);
		if(i>0)
		System.out.println("Debtor Details Added");
		else
		System.out.println("Debtor Details Error");
		
	}
	
	private void addBank(HttpServletRequest request, HttpServletResponse response, BankDetails bd) 
	{
		BankDao bnkdao = new BankDao();
		bd.setBank_name(request.getParameter("bankname"));
		bd.setBranch_name(request.getParameter("branchname"));
		bd.setIFSC(request.getParameter("ifsc"));
		bd.setAccnum(request.getParameter("accno"));
		bd.setCurrency(request.getParameter("currency"));
		int i = bnkdao.save(bd);
		if(i>0)
			System.out.println("Bank Details Added");
			else
			System.out.println("Bank Details Error");
	}
	
	private void addTransaction(HttpServletRequest request, HttpServletResponse response, TransactionDetails td) 
	{
	    TransactionDao tdao = new TransactionDao();
	    Random r = new Random();
		int tnum = r.nextInt(99999);
		td.setTransaction_num(tnum);
		int i = tdao.save(td);
		if(i>0)
			System.out.println("Transaction Details Added");
			else
			System.out.println("Transaction Details Error");
	}
		

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
