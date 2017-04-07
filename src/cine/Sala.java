package cine;

public class Sala {
	private String nombre;
	private int capacidad;
	int id;
	int idCine;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdCine() {
		return idCine;
	}
	
	public void setIdCine(int idCine) {
		this.idCine = idCine;
	}
	
	@Override
	public String toString() {
		return "Sala [nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}
	
	public Sala(String nombre, int capacidad, int id, int idCine) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.id = id;
		this.idCine = idCine;
	}
	public static Sala getSalaFromLine(String line) {
		String[] data = line.split(",");
		return new Sala(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]));
	}
}
