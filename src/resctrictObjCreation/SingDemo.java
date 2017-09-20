package resctrictObjCreation;

public class SingDemo {
	public static void main(String[] args) {
	      Singleton tmp = Singleton.getInstance( );
	      tmp.demoMethod( );
	      
	      Singleton tmp2 = Singleton.getInstance( );

	      Singleton tmp3 = Singleton.getInstance( );
	      System.out.println(tmp);
	      System.out.println(tmp2);

	      System.out.println(tmp3);


	   }
}
