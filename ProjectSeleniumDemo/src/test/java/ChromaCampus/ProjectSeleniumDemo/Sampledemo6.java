package ChromaCampus.ProjectSeleniumDemo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class Sampledemo6 {

	


	@Test(description = "This is demo6 method" , dependsOnMethods = {"demo7"}, alwaysRun = true)
	void demo6() {

		System.out.println("Demo6 method");

	}

	

	@Test (description = "This is demo7 method")
	void demo7(){

		System.out.println("Demo7 method");
		//Assert.assertTrue(false);
		
	}
	
	@SuppressWarnings("deprecation")
	@Test (description = "This is demo8 method",invocationCount =3 , threadPoolSize =2)
	
	void demo8(){

		System.out.println("Demo8method");
		
	     System.out.println(Thread.currentThread().getName());
	     System.out.println(Thread.currentThread().getId());
	
		
	}

}
