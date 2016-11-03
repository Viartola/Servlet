package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet3
 */
public class Servlet3 extends HttpServlet {
	List<user> listAllUsers = new ArrayList<user>();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		listAllUsers = ListarUsuarios.listar();
		req.setAttribute("listAllUsers", listAllUsers);
		redirect(req,resp);
		super.doPost(req, resp);
	}

	private void redirect(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/mostrar.jsp");
		dispatcher.forward(req,resp);
		//resp.sendRedirect("borrar.jsp");
	}
}
