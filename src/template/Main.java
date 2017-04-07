package template;

public class Main {

	public static void main(String[] args) {
		
	}
}

abstract class Plantilla {

	public final void prepararComida() {
		prepararIngredientes();
		mezclarIngredientes();
		cocinar();
		servir();
	}
	
	public abstract void prepararIngredientes();
	public abstract void mezclarIngredientes();
	public abstract void cocinar();
	public abstract void servir();
}
