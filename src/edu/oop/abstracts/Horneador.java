package edu.oop.abstracts;

import edu.oop.classes.Alimento;
import edu.oop.classes.AlimentoCocinado;
import edu.oop.interfaces.Cocinador;

/***
 * Esta clase sirve de molde para cualquier forma de hornear que se nos ocurra
 * @author gbene
 *
 */
public abstract class Horneador implements Cocinador{

	protected Alimento alimento;
	
	public abstract AlimentoCocinado Hornear();
	
	@Override
	public AlimentoCocinado cocinar() {
		return Hornear();
	}

	/***
	 * Esto simularía meter algo a cocinar en el método que hayamos creado
	 */
	@Override
	public void Cargar(Alimento alimento) {
		System.out.println("Cargado en -> " + this.toString());
		this.alimento = alimento;
	}
	
}
