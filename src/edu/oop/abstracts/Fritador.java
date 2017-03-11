package edu.oop.abstracts;

import edu.oop.classes.Alimento;
import edu.oop.classes.AlimentoCocinado;
import edu.oop.interfaces.Cocinador;

/***
 * Esta clase abstracta permite desacoplar, si quisiera crear varias formas de fritar
 * tengo esta como molde
 * @author gbene
 *
 */
public abstract class Fritador implements Cocinador{
	
	protected Alimento alimento;
	
	public abstract AlimentoCocinado Fritar();
	
	@Override
	public AlimentoCocinado cocinar() {
		return Fritar();
	}
	
	@Override
	public void Cargar(Alimento alimento) {
		System.out.println("Cargado en ->" + this.toString());
		this.alimento = alimento;
	}
	
}
