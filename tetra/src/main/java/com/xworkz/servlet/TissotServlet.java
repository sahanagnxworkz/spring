package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6,urlPatterns = "/tissot")
public class TissotServlet extends HttpServlet{

	public TissotServlet() {
		System.out.println("running TissotServlet...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(getClass().getSimpleName());
		super.doGet(req, resp);
	}
}
