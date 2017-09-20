package protot;

public class PrototypePatternDemo {
public static void main(String[] args) {
	ShapeCache.loadCache();
	
	Shape cloneShape=ShapeCache.getShape("1");
	System.out.println("Shape "+cloneShape.getType());
	
	Shape clonedshShape1=ShapeCache.getShape("2");
	System.out.println("shape "+clonedshShape1.getType());
	
	Shape clonedShape2=ShapeCache.getShape("3");
	System.out.println("Shape "+clonedShape2.getType());
	
}
}
