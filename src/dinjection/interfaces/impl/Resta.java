package dinjection.interfaces.impl;

import dinjection.interfaces.Operacion;

public class Resta implements Operacion {
	@Override
	public int operacionAritmetica(int a, int b) {
		return a - b;
	}
}
