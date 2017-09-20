package builder;

public class Computer {
	//Mandatory parameter
private String HDD;
private String RAM;
//optional parameter

private boolean isGraphicalCardEnabled;
private boolean isBluetoothEnabled;

//only getters for all 4 fields
public String getHDD() {
	return HDD;
}
public String getRAM() {
	return RAM;
}
public boolean isGraphicalCardEnabled() {
	return isGraphicalCardEnabled;
}
public boolean isBluetoothEnabled() {
	return isBluetoothEnabled;
}

public static class ComputerBuilder{
	
	// required parameters
			private String HDD;
			private String RAM;

			// optional parameters
			private boolean isGraphicsCardEnabled;
			private boolean isBluetoothEnabled;
			
			//constructor for 2 mandatory fields only

			public ComputerBuilder(String hDD, String rAM) {
				super();
				HDD = hDD;
				RAM = rAM;
			}
			//only setter getter for 2 optional fields 
			public void setRAM(String rAM) {
				RAM = rAM;
			}
			public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
				this.isGraphicsCardEnabled = isGraphicsCardEnabled;
				return this;
			}
	
			
			public Computer build(){
				
				return new Computer();
			}
			
			

}
}


//Notice that Computer class has only getter methods and no public constructor.
//So the only way to get a Computer object is through the ComputerBuilder class.



