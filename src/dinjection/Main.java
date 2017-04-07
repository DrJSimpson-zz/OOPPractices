package dinjection;

import java.util.Scanner;

import dinjection.factory.OperacionesFactory;
import dinjection.wrapper.Operador;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		OperacionesFactory of = new OperacionesFactory();
		
		Operador op = new Operador(of.getOperacion(s.nextLine()));
		
		System.out.println(op.operar(15, 20));
	}
}




