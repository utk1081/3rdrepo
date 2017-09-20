package single;

public class Main {
private static Main instance= new Main();
private Main(){
	System.out.println("private cons called ....");
	
	
}

public static Main getInstance(){
	
	return instance;
	
}
public void show(){
	System.out.println("inside show");
}
}
