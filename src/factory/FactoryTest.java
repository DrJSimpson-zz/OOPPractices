package factory;

import java.util.Scanner;

import factory.actualfactory.Circle;
import factory.actualfactory.Shape;
import factory.actualfactory.ShapeFactory;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.println("Que forma desea instanciar");
		Scanner scanner = new Scanner(System.in);
		
		Shape s = ShapeFactory.getShape("circle");
		s.draw();
	
		Circle c = (Circle)s;
		c.saludar();
	}

}
