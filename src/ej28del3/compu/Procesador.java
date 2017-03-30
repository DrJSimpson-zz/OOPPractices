package ej28del3.compu;

public class Procesador extends AbstractParteDePC {
	String marca;
	String modelo;
	int velocidadEnGhz;
	
	public Procesador(String marca, String modelo, int velocidadEnGhz) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadEnGhz = velocidadEnGhz;
	}
	
	
}
