package edu.oop.classes;

/***
 * Esto en realidad deber�a representar un alimento que fu� cociando
 * a esta parte ni la pens�, disfrutenla
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
