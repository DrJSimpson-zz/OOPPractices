package edu.oop.interfaces;

import edu.oop.classes.Alimento;
import edu.oop.classes.AlimentoCocinado;

public interface Cocinador {
	public AlimentoCocinado cocinar();
	public void Cargar(Alimento alimento);
}
