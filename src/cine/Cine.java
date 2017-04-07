package cine;

import java.util.ArrayList;
import java.util.List;

public class Cine {
	
	private List<Sala> salaList;
	private String nombre;
	private String ubicaci�n;
	int id;
	
	public List<Sala> getSalaList() {
		return salaList;
	}
	public void setSalaList(List<Sala> salaList) {
		this.salaList = salaList;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicaci�n() {
		return ubicaci�n;
	}
	public void setUbicaci�n(String ubicaci�n) {
		this.ubicaci�n = ubicaci�n;
	}
	
	public Cine(String nombre, String ubicaci�n, int id) {
		super();
		this.salaList = new ArrayList<Sala>();
		this.nombre = nombre;
		this.ubicaci�n = ubicaci�n;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Cine [salaList=" + salaList + ", nombre=" + nombre + ", ubicaci�n=" + ubicaci�n + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public static Cine getCineFromLine(String line) {
		String[] data = line.split(",");
		for (int i = 0; i < data.length; i++) {
			data[i] = data[i].trim();
		}
		return new Cine(data[0], data[1], Integer.parseInt(data[2]));
	}
}
