package cine;

import java.util.ArrayList;

import cine.wrapper.CineList;

public class Main {

	public static void main(String[] args) {
		RFileUtilitary rCine = new RFileUtilitary("c:/Users/gbene/workspace/OOPPractices/res/cine/cine.txt");
		RFileUtilitary rSala = new RFileUtilitary("c:/Users/gbene/workspace/OOPPractices/res/cine/Sala.txt");
		
		ArrayList<Cine> cineList = new ArrayList<Cine>();
		CineList cl = new CineList(cineList);
		ArrayList<Sala> salaList = new ArrayList<Sala>();
		
		String line;
		do {
			line = rCine.getLine();
			if (line != null) {
				cineList.add(Cine.getCineFromLine(line));
			}
		} while (line != null);
		
		do {
			line = rSala.getLine();
			if (line != null) {
				salaList.add(Sala.getSalaFromLine(line));
			}
		} while (line != null);
		
		for (Sala s : salaList) {
			System.out.println(s);
		}
		
		cl.intialize(salaList);
		
		for (Cine c: cineList) {
			System.out.println(c);
		}
		
		
	}
}
