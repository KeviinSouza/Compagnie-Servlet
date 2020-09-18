package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataBase {

	private static List<Compagnie> list = new ArrayList<>();
	private static Integer id = 1;

	static {
		Compagnie compagnieOne = new Compagnie();
		Compagnie compagnieTwo = new Compagnie();
		compagnieOne.setName("Kevinho");
		compagnieOne.setAge("22");
		compagnieOne.setId(DataBase.id++);
		compagnieTwo.setName("Fernandinho");
		compagnieTwo.setAge("17");
		compagnieTwo.setId(DataBase.id++);
		list.add(compagnieOne);
		list.add(compagnieTwo);
	}

	public void add(Compagnie c) {
		c.setId(DataBase.id++);
		DataBase.list.add(c);
	}

	public List<Compagnie> getCompagnie() {
		return DataBase.list;
	}

	public void remove(Integer idRequest) {

		Iterator<Compagnie> it = list.iterator();

		while (it.hasNext()) {
			Compagnie c = it.next();

			if (c.getId() == idRequest) {
				it.remove();
			}
		}
	}
}
