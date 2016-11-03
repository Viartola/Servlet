package servlet;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet
 */
public class Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Date fecha2=null;
		String user = req.getParameter("user");
		String fecha = req.getParameter("edad");
		String curso = req.getParameter("curso");
		try {
		fecha2 = new SimpleDateFormat("yyyy-MM-dd").parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(user);
		req.setAttribute("nom",user);
		req.setAttribute("ed",CalculaEdad.getEdad(fecha2));
		//req.setAttribute("ed",fecha);
		req.setAttribute("cur",curso);

		JavaConexion.crearTabla();
		insertarDatos.insertarTabla(user, CalculaEdad.getEdad(fecha2), curso);
		fecha2 = null;

		req.getRequestDispatcher("fin.jsp").forward(req, resp);
		//redirect(resp);
		super.doPost(req, resp);
	}


	private void redirect(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("fin.jsp");
	}
}
