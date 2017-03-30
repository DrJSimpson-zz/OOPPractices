package clases;

public class Auto {
	private String nombre;
	private Integer modelo;
	private String marca;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getModelo() {
		return modelo;
	}
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Auto(String nombre, Integer modelo, String marca) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.marca = marca;
	}
	
	
	
	@Override
	public String toString() {
		return "Auto [nombre=" + nombre + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	public static Auto getAutoFromTextLine(String line) {
		String[] value = line.split(",");
		Auto a = new Auto(value[0], Integer.parseInt(value[1]), value[2]);
		return a;
	}
}
