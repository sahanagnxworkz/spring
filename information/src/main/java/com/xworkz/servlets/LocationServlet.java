
package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("running location Servlet....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method....");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		

		if (name.length() > 3 && email.length() > 8 && startPoint.length() > 4 && destination.length() > 4
				&& gender != null) {
			writer.print("<span style='color:blue;'>");
			writer.print("suceess");
			writer.print("<br>");
			writer.print(name);
			writer.print("<br>");
			writer.print(email);
			writer.print("<br>");
			writer.print(startPoint);
			writer.print("<br>");
			writer.print(destination);
			writer.print("<br>");
			writer.print(gender);
			writer.print("</span>");
			writer.print("<br>");
			writer.print("<a href=\"index.html\">Home Page</a>");
			
		}
		else {
			writer.print("<span style='color:red;'>");
			writer.print("enter failure----location ");
		writer.print("<a href=\"index.html\">Home Page</a>");
			writer.print("</span>");
		}
		writer.print("</body>");
		writer.print("</html>");
		
		resp.setContentType("text/html");
	}
}
