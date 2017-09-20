package resctrictObjCreation;

public class SinAnyNo {
private static SinAnyNo obj;
private static int count=0;

private SinAnyNo(){
	count++;
}
public static synchronized SinAnyNo getInstance(){
	
	if(count<3){
		obj= new SinAnyNo();
	}
	return obj;
}

}
