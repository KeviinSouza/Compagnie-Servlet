package br.com.gerenciador.control;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.model.DataBase;

public class RemoveC implements Action{
	
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String idRequest = request.getParameter("id");
		Integer id = Integer.valueOf(idRequest);
		
		DataBase db = new DataBase();
		db.remove(id);
		
		return "redirect:entry?action=list";
	}

}
