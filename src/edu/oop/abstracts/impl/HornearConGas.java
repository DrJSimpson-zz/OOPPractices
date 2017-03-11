package edu.oop.abstracts.impl;

import edu.oop.abstracts.Horneador;
import edu.oop.classes.AlimentoCocinado;

public class HornearConGas extends Horneador {

	@Override
	public AlimentoCocinado Hornear() {
		System.out.println("Al horno en la volcano " + alimento.getNombre());
		AlimentoCocinado ac = new AlimentoCocinado(alimento);
		ac.toString();
		return ac;
	}

	@Override
	public String toString() {
		return "Soy un horno con gas guarda que exploto";
	}
	
	

}
