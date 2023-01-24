package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup =5,urlPatterns = "/quartz")
public class QuartzServlet extends HttpServlet {
	
	public QuartzServlet() {
		System.out.println("running Quartzervlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method :" +getClass().getSimpleName());
	}
}
