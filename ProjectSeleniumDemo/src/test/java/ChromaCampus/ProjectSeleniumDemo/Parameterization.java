package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	
	
	@Test
	@Parameters({"V1" , "V2"})
	public void parameterizationDemo1(int a , int b) {
		System.out.println( a + b);
	}
	
	
	@Test
	@Parameters({"fruit_value"})
	public void parameterizationDemo1(String fruit) {
		System.out.println(fruit);
	}

}
