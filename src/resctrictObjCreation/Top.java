package resctrictObjCreation;

public class Top {
static int count=0;
private static Top t;

private Top() {
	count=count++;
	
	
	}
public static Top getInstance(){
	if(count<3){
		t = new Top();
	}
	return t;
}

	
}   
