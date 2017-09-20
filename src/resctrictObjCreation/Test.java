package resctrictObjCreation;

public class Test {
public static void main(String[] args) {
	Top t1= Top.getInstance();
	Top t2= Top.getInstance();
	Top t3= Top.getInstance();
	Top t4= Top.getInstance();
	Top t5= Top.getInstance();
	Top t6= Top.getInstance();
	System.out.println(t1);	System.out.println(t2);
	System.out.println(t3);
	System.out.println(t4);
	System.out.println(t5);	System.out.println(t6);


}
}
