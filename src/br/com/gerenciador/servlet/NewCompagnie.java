package br.com.gerenciador.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hellow")
public class NewCompagnie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		Compagnie c = new Compagnie();
		c.setName(name);
		c.setAge(age);
		
		DataBase db = new DataBase();
		db.add(c);
		
		RequestDispatcher requestDispatch = request.getRequestDispatcher("/newRegister.jsp");
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		requestDispatch.forward(request, response);

	}
}
