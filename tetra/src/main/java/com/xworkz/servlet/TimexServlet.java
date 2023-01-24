package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4,urlPatterns = "/timex")
public class TimexServlet extends HttpServlet {

	public TimexServlet() {
	System.out.println("runing no-arg constr...of Timex");
	
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(" override doGet ...."+getClass().getSimpleName());
		
	}
}
