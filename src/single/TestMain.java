package single;

public class TestMain {
	
	public void m1(){
		System.out.println("hsas");
	 double sala= 50000.50;
	 System.out.println(sala);
	 m3();
	}
	
	public void m2(){
		System.out.println("hsas");
	 int frac= 50/100;
	 System.out.println(frac);
	}
	public void m3(){
		System.out.println("inside m3");
	
	}
	
	
public static void main(String[] args) {
	/*
	Main m1= Main.getInstance();
	Main m2=Main.getInstance();*/
	
	TestMain t= new TestMain();
	t.m1();
	t.m2();
	
	
	
	
	
}
}
