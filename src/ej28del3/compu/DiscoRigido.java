package ej28del3.compu;

public class DiscoRigido extends AbstractParteDePC {
	int capacidadEnGb;
	int velocidadEnRPM;
	boolean esSata;
	
	public void leer() {
		System.out.println("Estoy leyendo datos");
	}
	
	public void bootear() {
		if (this.isTurnedOn() == false) {
			System.out.println("Disco apagado, no se puede prender");
			return;
		}
		System.out.println("Cargando sistema operativo");
	}

	public DiscoRigido(int capacidadEnGb, int velocidadEnRPM, boolean esSata) {
		super();
		this.capacidadEnGb = capacidadEnGb;
		this.velocidadEnRPM = velocidadEnRPM;
		this.esSata = esSata;
	}
}
