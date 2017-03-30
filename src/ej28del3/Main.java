package ej28del3;

import ej28del3.compu.Computadora;
import ej28del3.compu.DiscoRigido;
import ej28del3.compu.FuenteDeAlimentacion;
import ej28del3.compu.MemoriaRAM;
import ej28del3.compu.PlacaDeVideo;
import ej28del3.compu.PlacaMadre;
import ej28del3.compu.Procesador;

public class Main {

	public static void main(String[] args) {
		Computadora c = new Computadora(
				new Procesador("AMD", "Ryzen", 3500), 
				new PlacaDeVideo("ATI", "R7", 2),
				new MemoriaRAM(16, 2333),
				new DiscoRigido(1024, 18000, true),
				new FuenteDeAlimentacion(750),
				new PlacaMadre("MasMejor", "AMD")
				);
		c.encender();
		//c.getHdd().bootear();
		
		c.setHdd(new DiscoRigido(2048, 7200, true));
		c.getHdd().bootear();
	}

}
