package factory;

import java.util.LinkedList;
import java.util.Scanner;

import factory.actualfactory.Shape;
import factory.actualfactory.ShapeFactory;

public class FactoryTest {

	public static void main(String[] args) {
		System.out.println("Que forma desea instanciar");
		Scanner sc = new Scanner(System.in);
		
		LinkedList<Shape> shapes = new LinkedList<Shape>();
		
		shapes.add(ShapeFactory.getShape("circle"));
		shapes.add(ShapeFactory.getShape("rectangle"));
		shapes.add(ShapeFactory.getShape("square"));
		shapes.add(ShapeFactory.getShape("triangle"));
		
		for (Shape s : shapes) {
			s.draw();
		}
	
	}

}
