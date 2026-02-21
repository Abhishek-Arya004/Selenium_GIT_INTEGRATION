

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Sampledemo3 {

	


	@Test(description = "This is demo5 method" , enabled = true, dependsOnMethods = {"demo4"})
	void demo5() {

		System.out.println("Demo5 method");

	}

	

	@Test (description = "This is demo4 method")
	void demo4() {

		System.out.println("Demo4 method");

	}

}
