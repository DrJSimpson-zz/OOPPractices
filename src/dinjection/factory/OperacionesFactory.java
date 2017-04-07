package dinjection.factory;

import dinjection.interfaces.Operacion;
import dinjection.interfaces.impl.*;

public class OperacionesFactory {
	
	public Operacion getOperacion(String operador) {
		if (operador.equalsIgnoreCase("resta")) {
			return new Resta();
		} else if (operador.equalsIgnoreCase("suma")) {
			return new Suma();
		} else if (operador.equalsIgnoreCase("multiplicacion")) {
			return new Multiplicacion();
		}
		return null;
	}
}
