package com.techandsolve.tuflujo.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PresupuestoFacturacion extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		resp.getWriter().println("<html><body><input id='bienvenida' type='text' value='Bienvenido. Haz tu presupuesto'.</body></html>");
	}
	
	
}
