package ChromaCampus.ProjectSeleniumDemo;

import org.testng.annotations.Test;

//Parallel Execution of test cases in TestNG
//multiple test cases will run at a time
//to achieve parallel execution we need to do some changes in testng.xml file
//<suite name="Suite" parallel="methods" thread-count="5">
//<suite name="Suite" parallel="tests" thread-count="5">
//<suite name="Suite" parallel="classes" thread-count="5">
//methods - test methods will run in parallel
//tests - test tags will run in parallel
//classes - test classes will run in parallel
//thread-count - number of threads to be used for parallel execution
//default is 1
//if we set thread-count to 5, then 5 test cases will run in parallel
//if we have 10 test cases and thread-count is 5, then first 5 test cases will run in parallel and then next 5 test cases will run in parallel
//if we have 3 test cases and thread-count is 5, then all 3 test cases will run in parallel
//if we have 10 test cases and thread-count is 3, then first 3 test cases will run in parallel, then next 3 test cases will run in parallel and so on
//we can set thread-count to any number based on our requirement
//we can also set thread-count to "infinite" to run all test cases in parallel but it is not recommended as it may lead to performance issues
//it is always better to set thread-count to a reasonable number based on the system configuration and test case requirements
//we can also set parallel attribute to "none" to disable parallel execution(sequential execution)
//<suite name="Suite" parallel="none">
//by default parallel attribute is set to "none"

	

public class ParallelExecution3 {
	
	@Test
	public void testCase7() {
		
		System.out.println("Test Case 7- " + Thread.currentThread().getId());
	}
	
	@Test
	public void testCase8() {
		
		System.out.println("Test Case 8 - " + Thread.currentThread().getId());
	}
	
	@Test
	public void testCase9() {
		
		System.out.println("Test Case 9 - " + Thread.currentThread().getId());
		}
	

}
