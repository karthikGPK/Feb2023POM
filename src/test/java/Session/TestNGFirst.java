package Session;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestNGFirst {

	@BeforeSuite
	public void sample() {
 System.out.println("Before Suite");
	}

	@BeforeTest
	public void sampleOne() {
		System.out.println("Before Test");
	}

	@BeforeClass(dependsOnMethods = "sampleTree")
	public void sampleTwo() {
		System.out.println("Before Class");
	}

	@BeforeMethod()
	public void sampleTree() {
		System.out.println("Before Metod");
	}

	@Test(invocationCount = 5)
	public void quotesTest() {
		System.out.println("Test One - Quotes");
	}

	@Test
	public void consolidationTest() {
		System.out.println("Test Two - Consolidation");
	}

	@AfterMethod
	public void sampleFour() {
		System.out.println("After Metod");
	}

	@AfterClass
	public void sampleFive() {
		System.out.println("After class");
	}
	@AfterTest
	public void sampleSix() {
		System.out.println("After Test");
	}
	@AfterSuite
	public void sampleSeven() {
		System.out.println("After Suite");
	}
}
