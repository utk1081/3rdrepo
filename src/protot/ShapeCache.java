package protot;

import java.util.Hashtable;

public class ShapeCache {

private static	Hashtable<String ,Shape> shapemap= new Hashtable<String,Shape>();
	
public static Shape getShape(String shapeid){
	
	Shape casedShape=shapemap.get(shapeid);
	
	return (Shape) casedShape.clone();
}
public static void loadCache(){
	Circle circle= new Circle();
	circle.setId("1");
	shapemap.put(circle.getId(), circle);
	
	Square square= new Square();
	square.setId("2");
	shapemap.put(square.getId(), square);
	
	Rectangle rectangle=new Rectangle();
	rectangle.setId("3");
    shapemap.put(rectangle.getId(), rectangle);

}


}
