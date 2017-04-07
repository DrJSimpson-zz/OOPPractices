package cine.wrapper;

import java.util.ArrayList;
import java.util.List;

import cine.Cine;
import cine.Sala;

public class CineList {
	ArrayList<Cine> listaCine;

	public CineList(ArrayList<Cine> listaCine) {
		super();
		this.listaCine = listaCine;
	}
	
	public void intialize(List<Sala> salaList) {
		for (Cine c : listaCine) {
			for (Sala s : salaList) {
				if (c.getId() == s.getIdCine()) {
					c.getSalaList().add(s);
				}
			}
		}
	}
}
