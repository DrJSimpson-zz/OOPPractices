package edu.oop;

import java.util.Scanner;

import edu.oop.abstracts.impl.FritarConAire;
import edu.oop.abstracts.impl.HornearConGas;
import edu.oop.abstracts.impl.HornearConHornoDeBarro;
import edu.oop.classes.Alimento;
import edu.oop.interfaces.Cocinador;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qué desea cocinar?");
		Alimento a = new Alimento(s.nextLine());
		
		//Mi programa solo debe saber que necesita un cocinador, el resto puede cambiar
		Cocinador c = null;
		
		//Acá podemos elegir la implementación, es a modo de ejemplo
		System.out.println("Como desea cocinarlo? 1 Frito, 2 Horno");
		int choice = s.nextInt();
		if (choice == 1) {
			c = new FritarConAire();
			c.Cargar(a);
		} else if (choice == 2) {
			System.out.println("Como desea hornearlo? 1 Horno Gas 2 Horno de Barro");
			int choice2 = s.nextInt();
			if (choice2 == 1) {
				c = new HornearConGas();
				c.Cargar(a);
			} else if (choice2 == 2) {
				c = new HornearConHornoDeBarro();
				c.Cargar(a);
			}
		}
		if (c != null) {
			c.cocinar();
		}
		else {
			System.out.println("Rompiste todo infeliz");
		}
		
	}

}
