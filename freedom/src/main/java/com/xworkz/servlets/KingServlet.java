package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("running no-args const...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running do get method...");
		
		String name = req.getParameter("name");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("queens");
		String dOB = req.getParameter("DOB");
		String dOD = req.getParameter("DOD");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(dOB);
		System.out.println(dOD);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:green;'>");
		writer.print("Series name: " + name);
		writer.print("Region: " + region);
		writer.print("no of queens : " + noOfQueens);
		writer.print("DOB : " + dOB);
		writer.print("dod : " + dOD);
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");
	}

}
