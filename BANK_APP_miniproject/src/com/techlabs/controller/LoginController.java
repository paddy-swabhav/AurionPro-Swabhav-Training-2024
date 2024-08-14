package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.connections.AdminDatabaseConnection;
import com.techlabs.connections.CustomerDatabaseConnection;
import com.techlabs.model.Admin;
import com.techlabs.model.Customer;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private  CustomerDatabaseConnection databaseconnection = null;
	private  AdminDatabaseConnection admindatabaseconnection = null;
	private RequestDispatcher dispatcher = null;
	
    public LoginController() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		databaseconnection = CustomerDatabaseConnection.getConnectionToDb();
		databaseconnection.connectToDatabase();
		admindatabaseconnection = AdminDatabaseConnection.getConnectionToDb();
		admindatabaseconnection.connectToDatabase();
		
		//Session
		HttpSession session=request.getSession(); 
	
		//Session
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String usertype = request.getParameter("type");
//		response.getWriter().print(username+password+usertype);
		
		if(usertype.equalsIgnoreCase("customer"))
		{
			
			List<Customer> customers = databaseconnection.getCustomerDetails();
			
			for(Customer customer:customers)
			{
				if(customer.getEmail().equals(username) && customer.getPassword().equals(password))
				{
					request.setAttribute("username", customer.getFirstName());
					dispatcher = request.getRequestDispatcher("/CustomerHome.jsp");
//					dispatcher.forward(request, response);
					session.setAttribute("name", customer.getFirstName());
					session.setAttribute("customerId", customer.getCustomerid());
					break;
				}
				else
				{
					dispatcher = request.getRequestDispatcher("/Else.jsp");	
				}
			}
			dispatcher.forward(request, response);
			return;
		}
		
		if(usertype.equalsIgnoreCase("admin"))
		{
			List<Admin> admins = admindatabaseconnection.getAdminDetails();
			
			for(Admin admin:admins)
			{
				if(admin.getEmail().equals(username) && admin.getPassword().equals(password))
				{
					request.setAttribute("username", admin.getName());
					dispatcher = request.getRequestDispatcher("/AdminHome.jsp");
//					dispatcher.forward(request, response);
					session.setAttribute("name", admin.getName());
					break;
				}
				else
				{
					dispatcher = request.getRequestDispatcher("/Else.jsp");	
				}
			}
			dispatcher.forward(request, response);
			return;
		}


		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
