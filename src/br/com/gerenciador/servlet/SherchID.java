package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sherchid")
public class SherchID extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idRequest = request.getParameter("id");
		Integer id = Integer.valueOf(idRequest);
		
		DataBase db = new DataBase();
		Compagnie c = db.getCompagnieById(id);
		
		request.setAttribute("c", c);
		RequestDispatcher rd = request.getRequestDispatcher("/formPopulated.jsp");
		rd.forward(request, response);
		
	}

}
