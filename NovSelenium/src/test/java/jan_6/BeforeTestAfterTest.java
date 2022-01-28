package jan_6;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BeforeTestAfterTest {

	@BeforeTest
	void BeforeTest() {
		System.out.println("I am from Before Test");
	}
	
	@AfterTest
	void AfterTest() {
		System.out.println("I am from After Test");
	}
	
}
