package resctrictObjCreation;

public class SingletonOtherTest {
public static void main(String[] args) {
	SingletonOtherWay o1= SingletonOtherWay.getInstance();
	SingletonOtherWay o2= SingletonOtherWay.getInstance();

	SingletonOtherWay o3= SingletonOtherWay.getInstance();

	SingletonOtherWay o4= SingletonOtherWay.getInstance();
	System.out.println(o1);
	System.out.println(o2);

	System.out.println(o3);

	System.out.println(o4);


}
}
