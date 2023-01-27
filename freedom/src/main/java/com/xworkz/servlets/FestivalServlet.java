package com.xworkz.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/festival")
public class FestivalServlet extends HttpServlet {

	public FestivalServlet() {
		// TODO Auto-generated constructor stub
		System.out.println("running festival..........");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method...");
		String festId = req.getParameter("id");
		String festName = req.getParameter("name");
		String festYear = req.getParameter("year");
		String festDate = req.getParameter("date");
		String festDay = req.getParameter("day");
		String festRegion = req.getParameter("region");
		String festFood = req.getParameter("food");
		String festNoOfdays = req.getParameter("noOfdays");
		String vegSpecial = req.getParameter("specail");
		String nonVegSpecial = req.getParameter("nonVeg");
		String total = req.getParameter("total");
		String season = req.getParameter("season");
		String purpose = req.getParameter("purpose");
		String godName = req.getParameter("godName");
		String members = req.getParameter("members");
		String lastCelebration = req.getParameter("lastCelebration");
		String FirstCelebration = req.getParameter("FirstCelebration");
		String nextCelebration = req.getParameter("next");
		String nextYearMonth = req.getParameter("nextMonth");
		String fCountry = req.getParameter("otherCountry");

		System.out.println(festId);
		System.out.println(festName);
		System.out.println(festYear);
		System.out.println(festDate);
		System.out.println(festDay);
		System.out.println(festRegion);
		System.out.println(festFood);
		System.out.println(festNoOfdays);
		System.out.println(vegSpecial);
		System.out.println(nonVegSpecial);
		System.out.println(total);
		System.out.println(season);
		System.out.println(purpose);
		System.out.println(godName);
		System.out.println(members);
		System.out.println(lastCelebration);
		System.out.println(FirstCelebration);
		System.out.println(nextCelebration);
		System.out.println(nextYearMonth);
		System.out.println(fCountry);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue;'>");
		writer.print("festival information");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

		resp.setContentType("text/html");

	}
}
