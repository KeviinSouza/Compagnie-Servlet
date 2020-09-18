package br.com.gerenciador.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.Compagnie;
import br.com.gerenciador.model.DataBase;

public class NewC {

	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Compagnie c = new Compagnie();
		c.setName(name);
		c.setAge(age);
		
		DataBase db = new DataBase();
		db.add(c);
		
		request.setAttribute("name", name);
		request.setAttribute("age", age);
	
		return "forward:/entry?action=list";
	}
}
