package factory;

public class ShapeFactory {
public Shape getShape(String shapeType){
	if(shapeType==null){
		return null;
	}
	if(shapeType.equalsIgnoreCase("Rectangle")){
		
		return new Rectangle();
	}
	if(shapeType.equalsIgnoreCase("square")){
		
		return new Square();
	}
	return null;
}
}
/**  Create a Factory to generate object of concrete class based on given information.

**/