package resctrictObjCreation;

public class Singleton {
	// private static Singleton singleton = new Singleton( );
	 private static Singleton singleton ;

private static int count=0;
	   /* A private Constructor prevents any other
	    * class from instantiating.
	    */
	   private Singleton() { count++;}

	   /* Static 'instance' method */
	   public static synchronized  Singleton getInstance( ) {
		   if(count<2){
			  singleton= new Singleton();
		   }
	      return singleton;
	   }

	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton");
	   }

}
