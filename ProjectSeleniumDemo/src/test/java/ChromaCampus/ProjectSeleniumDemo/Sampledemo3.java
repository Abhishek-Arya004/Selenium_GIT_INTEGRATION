package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.Test;



public class Sampledemo3 {

	


	@Test(description = "This is demo5 method" , enabled = true, dependsOnMethods = {"demo4"})
	void demo5() {

		System.out.println("Demo5 method");

	}

	

	@Test (description = "This is demo4 method" , expectedExceptions = {InterruptedException.class}, timeOut = 5000)
	void demo4() throws InterruptedException {

		System.out.println("Demo4 method");
		Thread.sleep(6000);

	}

}
