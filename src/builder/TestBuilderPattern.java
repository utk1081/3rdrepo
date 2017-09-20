package builder;

import builder.Computer.ComputerBuilder;

public class TestBuilderPattern {
public static void main(String[] args) {
	
	
	Computer c= new Computer.ComputerBuilder("500GB", "6GB").setGraphicsCardEnabled(true).build();
	System.out.println(c);
}
}
