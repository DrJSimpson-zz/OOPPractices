package ej28del3.compu;

public class Computadora {
	Procesador p;
	PlacaDeVideo vid;
	MemoriaRAM ram;
	DiscoRigido hdd;
	FuenteDeAlimentacion fuente;
	PlacaMadre mobo;
	
	public Computadora(Procesador p, PlacaDeVideo vid, MemoriaRAM ram, DiscoRigido hdd, FuenteDeAlimentacion fuente,
			PlacaMadre mobo) {
		super();
		this.p = p;
		this.vid = vid;
		this.ram = ram;
		this.hdd = hdd;
		this.fuente = fuente;
		this.mobo = mobo;
	}
	
	public void encender() {
		System.out.println("Encendiendo computadora");
		this.fuente.encender();
		this.mobo.encender();
		this.hdd.encender();
		this.ram.encender();
		//y el resto tambien
	}

	public DiscoRigido getHdd() {
		return hdd;
	}

	public void setHdd(DiscoRigido hdd) {
		this.hdd = hdd;
	}
	
	
}
