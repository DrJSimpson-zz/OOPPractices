package edu.oop.abstracts.impl;

import edu.oop.abstracts.Fritador;
import edu.oop.classes.AlimentoCocinado;

public class FritarConAire extends Fritador {

	@Override
	public AlimentoCocinado Fritar() {
		System.out.println("Fritando con esas maquinitas locas de Sprayette " + alimento.getNombre());
		AlimentoCocinado ac = new AlimentoCocinado(alimento);
		ac.toString();
		return ac;
	}

	@Override
	public String toString() {
		return "Llame a su operadora local y reciba tres productos al precio de cuatro";
	}
	
	

}
