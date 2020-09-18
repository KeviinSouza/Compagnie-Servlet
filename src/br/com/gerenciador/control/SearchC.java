package br.com.gerenciador.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Compagnie;
import br.com.gerenciador.model.DataBase;

public class SearchC {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idRequest = request.getParameter("id");
		Integer id = Integer.valueOf(idRequest);
		
		DataBase db = new DataBase();
		Compagnie c = db.getCompagnieById(id);
		
		request.setAttribute("c", c);
		RequestDispatcher rd = request.getRequestDispatcher("/formPopulated.jsp");
		rd.forward(request, response);
	}

}
