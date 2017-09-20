package AbstractFactory;

public    class Test {
	public void m2outer(){
		System.out.println("inside outer");
	}
public static class L{
	public void m1(){
		System.out.println("inside m1");
	}
}
	public static void main(String[] args) {
		L t= new L();
		t.m1();
	}
}
