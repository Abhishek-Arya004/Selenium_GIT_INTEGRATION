package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(description = "This is used fo addtion" , dataProvider = "DataProviderMethod")
	void Add(int a, int b) {

		System.out.println(a + b);

	}
	
	@Test(description = "This is used fo Subtraction" , dataProvider = "DataProviderMethod")
	void Sub(int a, int b) {

		System.out.println(a - b);

	}
	
	@Test(description = "This is used fo Subtraction" , dataProvider = "div")
	void div(int a ){

		System.out.println(a/ 2);

	}
	
	
	@DataProvider
	
	Object[] div() {
		
		Object[] datadiv = new Object[3];
		datadiv[0] = 20;
		datadiv[1] = 200;
		datadiv[2] = 2000;
		
		return datadiv;
	}

	@DataProvider

	Object[][] DataProviderMethod() {
		
		
		Object[][] data = new Object[3][2];

		data[0][0] = 10;// 10 , 20
		data[0][1] = 20;

		data[1][0] = 100;// 100, 200
		data[1][1] = 200;

		data[2][0] = 1000; // 1000 , 2000
		data[2][1] = 2000;
		return data;

	}

}
