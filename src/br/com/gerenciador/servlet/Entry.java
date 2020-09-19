package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import br.com.gerenciador.control.*;


@WebServlet("/entry")
public class Entry extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		String destiny = null;

		if (action.equals("list")) {

			ListC list = new ListC();
			destiny = list.execute(request, response);

		} else if (action.equals("change")) {

			ChangeC company = new ChangeC();
			destiny = company.execute(request, response);

		} else if (action.equals("remove")) {

			RemoveC remove = new RemoveC();
			destiny = remove.execute(request, response);

		} else if (action.equals("add")) {

			NewC add = new NewC();
			destiny = add.execute(request, response);

		} else if (action.equals("search")) {

			SearchC search = new SearchC();
			destiny = search.execute(request, response);
		}

		else if (action.equals("form")) {

			FormC form = new FormC();
			destiny = form.execute(request, response);
		}

		String[] destinyRequest = destiny.split(":");

		if (destinyRequest[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/" + destinyRequest[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(destinyRequest[1]);
		}
	}
}