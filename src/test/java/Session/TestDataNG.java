package Session;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public abstract class TestDataNG {

	@BeforeSuite
	public void BeforeSuite() {
System.out.println("Before Suite");
	}

	@BeforeTest
	public void BeforeTest() {
System.out.println("Before test");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void BeforeMetod() {
System.out.println("Before ME");
	}

	@DataProvider
	@Test(priority = -1, expectedExceptions = ArithmeticException.class, invocationCount = 2)
	public void Test() {
System.out.println("First Test");
	}

	@Test
	public void TestOne() {
System.out.println("Test One");
	}

	@Test
	public void TestTree() {
System.out.println("Test Tree");
	}

	@AfterMethod
	public void AfterMetod() {
System.out.println("After Metod");
	}

	@org.testng.annotations.AfterClass
	public void AfterClass() {
System.out.println("After Class");
	}

	@org.testng.annotations.AfterClass
	public void AfterTest() {
System.out.println("After Test");
	}

	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
System.out.println("After Suite");
	}

}
