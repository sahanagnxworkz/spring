package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/webseries")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("Running WebSeriesServlet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("running do get method...");

		String name = req.getParameter("name");
		String language = req.getParameter("language");
		String episodes = req.getParameter("episode");
		String ott = req.getParameter("ott");
		String budget = req.getParameter("budget");

		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue;'>");
		writer.print("Series name: " + name);
		writer.print("Series language: " + language);
		writer.print("episode : " + episodes);
		writer.print("ott : " + ott);
		writer.print("budget : " + budget);
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}

}
