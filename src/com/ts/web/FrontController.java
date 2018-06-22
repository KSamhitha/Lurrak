
package com.ts.web;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ts.dbutility.DBConnection;
import com.ts.dao.AdminDAO;
import com.ts.dao.OwnerDAO;
import com.ts.dao.BuyerDAO;
import bvrit.Admin;
import bvrit.Owner;
import bvrit.Buyer;


@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if("ownerRegister".equalsIgnoreCase(action)){
			registerOwner(request).forward(request,response);
			return;
		}
		if("buyerRegister".equalsIgnoreCase(action)){
			registerBuyer(request).forward(request,response);
			return;
		}
		
		if("adminLogin".equals(action)){
			loginAsAdmin(request).forward(request,response);
			return;
		}
		if("ownerLogin".equals(action)){
			loginAsOwner(request).forward(request,response);
			return;
		}
		if("buyerLogin".equals(action)){
			loginAsOwner(request).forward(request,response);
			return;
		}
	}
	private RequestDispatcher loginAsOwner(HttpServletRequest request) {
	    int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		RequestDispatcher dispatcher=null;
		OwnerDAO ownerdao=new OwnerDAO();
		Owner owner=ownerdao.getOwner(id);
		if(owner.getId()==id && owner.getPassword().equals(password)){
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", owner);
			
			dispatcher=request.getRequestDispatcher("OwnerLandDetails.jsp");	
		}
		return dispatcher;
	}
		
		
	private RequestDispatcher loginAsAdmin(HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		RequestDispatcher dispatcher=null;
		AdminDAO admindao=new AdminDAO();
		Admin  admin=admindao.getAdmin(id);
		if(admin.getId()==id && admin.getPassword().equals(password)){
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", admin);
		    dispatcher=request.getRequestDispatcher("AdminHomePanel.jsp");	
		}
		return dispatcher;
	}
	
	private RequestDispatcher loginAsBuyer(HttpServletRequest request) {
	    int id=Integer.parseInt(request.getParameter("id"));
		String password=request.getParameter("password");
		RequestDispatcher dispatcher=null;
		BuyerDAO buyerdao=new BuyerDAO();
		Buyer buyer=buyerdao.getBuyer(id);
		if(buyer.getId()==id && buyer.getPassword().equals(password)){
			HttpSession session=request.getSession();
			session.setAttribute("loggedUser", buyer);
		    dispatcher=request.getRequestDispatcher("TypesOfLand.jsp");	
		}
		return dispatcher;
	}
	private RequestDispatcher registerBuyer(HttpServletRequest request) {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		int phone =Integer.parseInt(request.getParameter("phone"));
		int houseNo=Integer.parseInt(request.getParameter("houseNo"));
		String colony = request.getParameter("colony");
		String city = request.getParameter("city");
		int pincode = Integer.parseInt(request.getParameter("pincode"));
		
		Buyer buyer =new Buyer();
		buyer.setId(id);
		buyer.setName(name);
		buyer.setEmail(email);
		buyer.setPassword(password);
		buyer.setPhone(phone);
		buyer.setHouseNo(houseNo);
		buyer.setColony(colony);
		buyer.setCity(city);
		buyer.setPincode(pincode);
		
		
		System.out.println("console print:"+buyer);
		BuyerDAO buyerDAO = new BuyerDAO();
		
		RequestDispatcher dispatcher=null;
		if(buyerDAO.add(buyer)!=0){
			request.setAttribute("regStatus", "Registration Success.!");
			dispatcher = request.getRequestDispatcher("BuyerLogin.jsp");
		}
		return dispatcher;
		}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
}


		private RequestDispatcher registerOwner(HttpServletRequest request) {
			int id=Integer.parseInt(request.getParameter("id"));
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			int phone =Integer.parseInt(request.getParameter("phone"));
			int houseNo=Integer.parseInt(request.getParameter("houseNo"));
			String colony = request.getParameter("colony");
			String city = request.getParameter("city");
			int pincode = Integer.parseInt(request.getParameter("pincode"));
			
			Owner owner =new Owner();
			owner.setId(id);
			owner.setName(name);
			owner.setEmail(email);
			owner.setPassword(password);
			owner.setPhone(phone);
			owner.setHouseNo(houseNo);
			owner.setColony(colony);
			owner.setCity(city);
			owner.setPincode(pincode);
			
	
			System.out.println("console print:"+owner);
			OwnerDAO ownerDAO = new OwnerDAO();
			RequestDispatcher dispatcher=null;
			if(ownerDAO.add(owner)!=0){
				request.setAttribute("regStatus", "Registration Success.!");
				dispatcher = request.getRequestDispatcher("OwnerLogin.jsp");
			}
			
			if(owner.getId()==id && owner.getPassword().equals(password)){
				HttpSession session=request.getSession();
				session.setAttribute("loggedUser", owner);
				request.setAttribute("regStatus", "You are logged in.");
				dispatcher = request.getRequestDispatcher("OwnerLandDetails.jsp");
				
			}
			return dispatcher;
		}

       }
