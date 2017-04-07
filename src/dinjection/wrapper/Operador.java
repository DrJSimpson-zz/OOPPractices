package dinjection.wrapper;

import dinjection.interfaces.Operacion;

public class Operador {
	Operacion o;

	public Operador(Operacion o) {
		super();
		this.o = o;
	}

	public Operacion getO() {
		return o;
	}

	public void setO(Operacion o) {
		this.o = o;
	}
	
	public int operar(int a, int b) {
		return o.operacionAritmetica(a, b);
	}
}
