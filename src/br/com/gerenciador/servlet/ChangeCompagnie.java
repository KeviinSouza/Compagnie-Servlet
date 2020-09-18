package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/changec")
public class ChangeCompagnie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		Integer idRequest = Integer.valueOf(id);
		
		DataBase db = new DataBase();
		Compagnie c = db.getCompagnieById(idRequest);
		c.setName(name);
		c.setAge(age);
		
		response.sendRedirect("listc");
		
	}

}
