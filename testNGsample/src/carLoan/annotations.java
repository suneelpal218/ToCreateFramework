package carLoan;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {

	@BeforeSuite
	public void beforeSuiteExample() {
		System.out.println("I am before suite");
	}
     @BeforeTest
	public void beforeTestExampe() {
		System.out.println("I am before test");
	}
	@BeforeClass
	public void beforeclassExample() {
		System.out.println("I am before class");
	}
	@BeforeMethod
	public void beforemethodExample() {
		System.out.println("I am before method");
		
	}
	@Test
	public void sampleTestExample() {
		System.out.println("I am test");
		
	}
	@AfterMethod
	public void aftermethodExample() {
		System.out.println("I am after method");
		
	}
	@AfterClass
	public void afterclassExample() {
		System.out.println("I am after class");
		
	}
	@AfterTest
	public void aftertestExample() {
		System.out.println("I am after test");
		
	}
	@AfterSuite
	public void aftersuiteExample() {
		System.out.println("I am after suite");
		
	}

}
