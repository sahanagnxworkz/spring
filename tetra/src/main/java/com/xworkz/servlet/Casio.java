package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup =8,urlPatterns = "/casio")
public class Casio extends HttpServlet{
public Casio() {
	System.out.println("running casio..");
}

@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println(getClass().getSimpleName());
	//	super.doGet(req, resp);
	}
}
