package factory.actualfactory;

public class ShapeFactory {
	public static Shape getShape(String name) {
		if (name.equalsIgnoreCase("triangle")) {
			return new Triangle();
		} else if (name.equalsIgnoreCase("square")) {
			return new Square();
		} else if (name.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (name.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		}
		return null;
	}
}
