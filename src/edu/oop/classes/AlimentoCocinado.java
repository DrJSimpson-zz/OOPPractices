package edu.oop.classes;

/***
 * Esto en realidad debería representar un alimento que fué cociando
 * a esta parte ni la pensé, disfrutenla
 * @author gbene
 *
 */
public class AlimentoCocinado {

	private Alimento alimento;
	
	@Override
	public String toString() {
		return "AlimentoCocinado [" + alimento.nombre + "]";
	}

	public AlimentoCocinado(Alimento alimento) {
		super();
		this.alimento = alimento;
	}
	
	
}
