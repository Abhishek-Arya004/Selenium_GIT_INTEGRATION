package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class Sampledemo4 {

	@Test(description = "This is demo5 method",priority =3, groups = "Progression")// -70000 to 7000
	void A() {

		System.out.println("A method");

	}

	@Test(description = "B  method" ,priority =1, groups = {"Sanity","Progression"})
	void B() {

		System.out.println("B method");

	}

	@Test(description = "C  method",priority =2 , groups = "Sanity")
	void C() {

		System.out.println("C method");

	}
	
	@Test(description = "D  method",priority =2 , groups = "Regression")
	void D() {

		System.out.println("D method");

	}
	
	@Test(description = "E  method",priority =2 , groups = "Regression")
	void E() {

		System.out.println("E method");

	}
	

	@Test(description = "F  method",dependsOnGroups = "Sanity")
	void F() {

		System.out.println("F method");

	}

}
