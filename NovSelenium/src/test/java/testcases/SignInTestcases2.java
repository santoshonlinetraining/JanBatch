package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class SignInTestcases2 extends TestBase {

	@Test(groups= {"signin", "smoke", "regression", "p1"})
	void signInTestcase001() {
		homeObj.getSignInLink().click();
		
		authObj.setEmailaddressSignIn("santosh@test.com");
		authObj.setPassword("123456");
		authObj.getSigninbutton().click();
		
		if(myAccountObj.getSignout().isEnabled()) {
			System.out.println("Successfully logined to account");
		} else {
			System.out.println("failed to login");
		}
	}
	
}
