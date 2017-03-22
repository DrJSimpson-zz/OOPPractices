package factory.actualfactory;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Circle");
	}
	
	public void saludar() {
		System.out.println("Hola soy un circulo redondo");
	}
	
	protected Circle() {
		
	}
}
