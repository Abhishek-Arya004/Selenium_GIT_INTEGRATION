package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
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

-------------Annotation Attributes---

1. description : It is used to describe the test case.
2. enabled : It is used to enable or disable a test case.
3. groups : It is used to group test cases.
4. dependsOnMethods : It is used to create dependencies between test methods.
5. timeOut : It is used to specify the maximum time a test case should take to
6. invocationCount : It is used to specify the number of times a test method should be invoked.
7. priority : It is used to specify the order of execution of test methods.
8. alwaysRun : It is used to specify that a test method should always run even if it depends on a method that failed.
9. suiteName : It is used to specify the name of the test suite.
10. testName : It is used to specify the name of the test.
11. dataProvider : It is used to specify the data provider for a test method.
12. dataProviderClass : It is used to specify the class that contains the data provider for
13. retryAnalyzer : It is used to specify the retry analyzer for a test method.
14. invocationTimeOut : It is used to specify the maximum time a test method should take to complete all its invocations.
15. threadPoolSize : It is used to specify the number of threads to be used for
16. skipFailedInvocations : It is used to specify whether to skip failed invocations of a test method.
17. successPercentage : It is used to specify the percentage of successful invocations required for a test method to be considered successful.
18. ignoreMissingDependencies : It is used to specify whether to ignore missing dependencies for a test method.
19. timeout : It is used to specify the maximum time a test method should take to complete.
20. invocationCount : It is used to specify the number of times a test method should be invoked.
21. singleThreaded : It is used to specify whether a test method should be executed in a single thread.
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
