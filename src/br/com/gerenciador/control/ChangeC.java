package br.com.gerenciador.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Compagnie;
import br.com.gerenciador.model.DataBase;

public class ChangeC {
	
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String id = request.getParameter("id");
		Integer idRequest = Integer.valueOf(id);
		
		DataBase db = new DataBase();
		Compagnie c = db.getCompagnieById(idRequest);
		c.setName(name);
		c.setAge(age);
		
		response.sendRedirect("entry?action=list");
	}

}
