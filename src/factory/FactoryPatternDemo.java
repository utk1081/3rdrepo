package factory;

public class FactoryPatternDemo {

	
	public static void main(String[] args) {
		ShapeFactory factory= new ShapeFactory();
		//1 get instance of Rectangle
		
		Shape sRectangle = factory.getShape("rectangle");
		Shape sCircle=factory.getShape("square");
		sRectangle.draw();
		sCircle.draw();
		
		
	}
}
