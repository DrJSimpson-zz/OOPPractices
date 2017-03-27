package archivos;

import java.util.Scanner;

import clases.Auto;
import clases.Persona;

public class PersonaFromFile {

	public static void main(String[] args) {
		Persona p = Persona.getPersonaFromString("Pepe,Palote,15");
		System.out.println(p);
		
		Scanner sc = new Scanner(System.in); 
		Persona p1 = Persona.getPersonaFromString(sc.next());
		System.out.println(p1);
		
		Auto a = Auto.getAutoFromTextLine(sc.next());
		System.out.println(a);
	}

}
