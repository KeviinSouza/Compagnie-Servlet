package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	private static List<Compagnie> list = new ArrayList<>();
	
	
	public void add(Compagnie c) {
		list.add(c);
	}
	
	 

}
