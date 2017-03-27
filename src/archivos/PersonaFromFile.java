package archivos;

import clases.Persona;

public class PersonaFromFile {

	public static void main(String[] args) {
		Persona p = Persona.getPersonaFromString("Pepe,Palote,15");
		System.out.println(p);
	}

}
