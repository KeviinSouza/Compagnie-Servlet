package br.com.gerenciador.control;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.gerenciador.model.Compagnie;
import br.com.gerenciador.model.DataBase;

public class ListC {
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DataBase db = new DataBase();
		List<Compagnie> list = db.getCompagnie();
		
		request.setAttribute("compagnie", list);
		
		return "forward:listCompany.jsp";
	}
	
}
