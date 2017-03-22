package factory.actualfactory;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Square");
	}

	public void blabla() {
		System.out.println("Soy un cuadrado, tengo cuatro lados *cantado*");
	}
	
	protected Square() {
		
	}
}
