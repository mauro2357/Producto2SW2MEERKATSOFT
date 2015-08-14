package com.techandsolve.tuflujo;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import com.techandsolve.tuflujo.webapp.PresupuestoFacturacion;

public class EntryPoint {
	
	private Server server;

	public void inicializarAplicacion() throws Exception {
		server = new Server(8080);
		ServletContextHandler servletContextHandler = new ServletContextHandler(ServletContextHandler.SESSIONS);
		servletContextHandler.setContextPath("/");
		ServletHolder sh = new ServletHolder(PresupuestoFacturacion.class);
		servletContextHandler.addServlet(sh, "/presupuestoFacturacion");
		HandlerList handlers = new HandlerList();
		handlers.setHandlers(new Handler[] { servletContextHandler });

		server.setHandler(handlers);
		server.start();
	}
	
	public void joinServerThread() throws InterruptedException{
		server.join();
	}
	
	public void stopServer() throws Exception{
		server.stop();
	}

	public static void main(String[] args) throws Exception {
		EntryPoint entryPoint=new EntryPoint();
		entryPoint.inicializarAplicacion();
		entryPoint.joinServerThread();
	}
}
