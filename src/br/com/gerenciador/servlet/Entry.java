package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.control.ChangeC;
import br.com.gerenciador.control.ListC;
import br.com.gerenciador.control.NewC;
import br.com.gerenciador.control.RemoveC;
import br.com.gerenciador.control.SearchC;

@WebServlet("/entry")
public class Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equals("list")) {

			ListC list = new ListC();
			list.execute(request, response);

		} else if (action.equals("change")) {

			ChangeC company = new ChangeC();
			company.execute(request, response);

		} else if (action.equals("remove")) {

			RemoveC remove = new RemoveC();
			remove.execute(request, response);
			
		} else if (action.equals("add")) {

			NewC add = new NewC();
			add.execute(request, response);
			
		} else if (action.equals("search")) {

			SearchC search = new SearchC();
			search.execute(request, response);
		}
	}
}