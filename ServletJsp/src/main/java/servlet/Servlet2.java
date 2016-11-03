package servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		//System.out.println(user);
		req.setAttribute("nom",user);
		
		JavaConexion.crearTabla();
		BorrarDatos.BorrarTabla(user);
		
		redirect(resp);
		super.doPost(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("user");
		//System.out.println(user);
		req.setAttribute("nom",user);
		
		//JavaConexion.crearTabla();
		BorrarDatos.BorrarTabla(user);
		
		redirect(resp);
		super.doPost(req, resp);
	}

	private void redirect(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("aviso.jsp");
	}
}
