package template;

public class TestHousetemplate {
public static void main(String[] args) {
	HouseTemplate t1= new WoodenHouse();
	t1.buildHouse();
	HouseTemplate t2=new GlassHouse();
	t2.buildHouse();
	
}
}
