package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*


@BeforeSuite

@AfterSuite

@BeforeTest

@AfterTest

@BeforeGroups

@AfterGroups

@BeforeClass

@AfterClass

@BeforeMethod

@AfterMethod


*/

public class SampleDemo1 {

	@BeforeSuite
	void beforesuite() {

		System.out.println("beforesuite");

	}


	@BeforeTest
	void Beforetest() {

		System.out.println("Beforetest");

	}

	@AfterTest
	void Aftertest() {

		System.out.println("Aftertest");

	}

	
	@BeforeMethod
	void Beforemethod() {

		System.out.println("Beforemethod");

	}
	@AfterMethod
	void Aftermethod() {

		System.out.println("Aftermethod");

	}

	@BeforeClass
	void Beforeclass() {

		System.out.println("Beforeclass");

	}

	@AfterClass
	void Afterclass() {

		System.out.println("Afterclass");

	}

	@Test
	void demo1() {

		System.out.println("Demo1 method");

	}

	@Test
	void demo2() {

		System.out.println("Demo2 method");

	}


}
