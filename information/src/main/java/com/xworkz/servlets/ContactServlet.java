package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		System.out.println("running contact servlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("runnign doGet method");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String Number = req.getParameter("mobileNumber");
//		Long mobileNumber = Long.parseLong(Number);
//		req.getParameter("mobileNumber");
		
		String comment = req.getParameter("comment");
		
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
	
		
		if (name.length() > 3 && email.length() > 8 && Number.length()==10
				&& comment.length()>=5)	 {
			writer.print("<span style='color:blue;'>");
			writer.print("suceess");
			writer.print("<br>");
			writer.print(name);
			writer.print("<br>");
			writer.print(email);
			writer.print("<br>");
			writer.print(Number);
			writer.print("<br>");
			writer.print(comment);
			writer.print("<br>");
			writer.print("</span>");
			writer.print("<br>");
			System.out.println(name);
			System.out.println(email);  	
			System.out.println(Number);
			System.out.println(comment);
			writer.print("<a href=\"index.html\">Home Page</a>");
			
		}
		else {
			writer.print("<span style='color:red;'>");
			writer.print("enter failure of contact details");
			System.out.println("in valid enteries");
			writer.print("<a href=\"index.html\">Home Page</a>");
			writer.print("</span>");
		}
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}

	}


