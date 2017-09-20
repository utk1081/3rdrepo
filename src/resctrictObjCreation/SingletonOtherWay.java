package resctrictObjCreation;

public class SingletonOtherWay {
private static SingletonOtherWay obj;
private static int count=0 ;
private SingletonOtherWay(){
	count++;
}
public static SingletonOtherWay getInstance(){
	
	if(count<1){
		obj= new SingletonOtherWay();
	}
	return obj;
}
}
