package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class SignInTestcases extends TestBase {

	@Test(groups= {"signin", "smoke", "regression"})
	void signInTestcase001() {
		homeObj.getSignInLink().click();
		authObj.setEmailaddressSignIn(prop.getProperty("username"));
		authObj.setPassword(prop.getProperty("password"));
		authObj.getSigninbutton().click();
		
		if(myAccountObj.getSignout().isEnabled()) {
			log.info("Successfully logined to account");
		} else {
			log.error("failed to login");
		}
		
		
	}
	
}
