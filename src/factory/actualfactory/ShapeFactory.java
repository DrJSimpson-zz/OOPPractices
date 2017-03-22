package factory.actualfactory;

public class ShapeFactory {
	public static Shape getShape(String name) {
		if (name.equals("triangle")) {
			return new Triangle();
		} else if (name.equals("square")) {
			return new Square();
		} else if (name.equals("circle")) {
			return new Circle();
		}
		return null;
	}
}
