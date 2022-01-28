package temp_test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

	@Test
	void test() {
		SoftAssert softassert = new SoftAssert();
		String a,b;
		a = "10";
		b= "11";
		softassert.assertEquals(a, b, "A and B not same");
		System.out.println("1");
		
		a = "10";
		b= "10";
		softassert.assertEquals(a, b, "A and B  same");
		System.out.println("1");
		
		softassert.assertAll();
	}
	
}
