package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/listc")
public class ListCompagnie extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DataBase db = new DataBase();
		List<Compagnie> list = db.getCompagnie();
		int teste = 35;
		request.setAttribute("compagnie", list);
		RequestDispatcher rd = request.getRequestDispatcher("/listCompagnie.jsp");
		rd.forward(request, response);
	
	}

}
