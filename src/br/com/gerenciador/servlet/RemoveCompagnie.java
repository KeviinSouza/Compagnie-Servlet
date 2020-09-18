package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/remove")
public class RemoveCompagnie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idRequest = request.getParameter("id");
		Integer id = Integer.valueOf(idRequest);
		
		DataBase db = new DataBase();
		db.remove(id);
		
		response.sendRedirect("listc");
		
	}
}
