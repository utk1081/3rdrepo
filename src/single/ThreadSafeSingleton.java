package single;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton obj;
	private ThreadSafeSingleton(){
		
	}
	public static ThreadSafeSingleton getInstance(){
		if(obj==null){
			obj= new ThreadSafeSingleton();
		}
		
		return obj;
	}
}
