package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class DataBase {

	private static List<Compagnie> list = new ArrayList<>();
	
	static {
		Compagnie compagnieOne = new Compagnie();
		Compagnie compagnieTwo = new Compagnie();
		compagnieOne.setName("Kevinho");
		compagnieOne.setAge("22");
		compagnieTwo.setName("Fernandinho");
		compagnieTwo.setAge("17");
		list.add(compagnieOne);
		list.add(compagnieTwo);
	}
	
	
	public void add(Compagnie c) {
		DataBase.list.add(c);
	}
	
	public List<Compagnie> getCompagnie(){
		return DataBase.list;	
	}

}
