package basics;

public class Ejemplo {
	private String atributoEjemplo;

	public static String showAtributoEjemplo(Ejemplo e) {
		return e.getAtributoEjemplo();
	}
	
	public String getAtributoEjemplo() {
		return atributoEjemplo;
	}

	public void setAtributoEjemplo(String atributoEjemplo) {
		this.atributoEjemplo = atributoEjemplo;
	}

	@Override
	public String toString() {
		return "Ejemplo [atributoEjemplo=" + atributoEjemplo + "]";
	}

	public Ejemplo(String atributoEjemplo) {
		super();
		this.atributoEjemplo = atributoEjemplo;
	}
	
	
}
