package edu.oop.abstracts.impl;

import edu.oop.abstracts.Horneador;
import edu.oop.classes.AlimentoCocinado;

public class HornearConHornoDeBarro extends Horneador {

	@Override
	public AlimentoCocinado Hornear() {
		System.out.println("Al horno de barro " + alimento.getNombre());
		AlimentoCocinado ac = new AlimentoCocinado(alimento);
		ac.toString();
		return ac;
	}
	
	@Override
	public String toString() {
		return "Sot un horno de Barro";
	}

}
