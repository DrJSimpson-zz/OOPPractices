package edu.oop.classes;
/***
 * Esto sería algo así como la carne cruda o las papas sucias y con piel
 * tampoco pensé muco en esto, sino que me dediqué mas al "algoritmo"de
 * cocinar
 * @author gbene
 *
 */
public class Alimento {
	String nombre;

	public Alimento(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "[ " + nombre + "] ";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
}
