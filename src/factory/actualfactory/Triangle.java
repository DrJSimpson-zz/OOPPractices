package factory.actualfactory;

public class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Drawing a Triangle");
	}
	
	protected Triangle() {
		
	}
}
