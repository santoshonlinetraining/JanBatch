package testcases;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import com.relevantcodes.extentreports.LogStatus;

public class SignInTestcases3 extends TestBase {

	@Test(groups= {"signin", "smoke", "regression"}, enabled=false)
	void signInTestcase001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");
		
		homeObj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the SignIn link");
		
		authObj.setEmailaddressSignIn(prop.getProperty("username"));
		authObj.setPassword(prop.getProperty("password"));
		authObj.getSigninbutton().click();
		logger.log(LogStatus.INFO, "Entered username and password");
		
		logger.log(LogStatus.INFO, "Verify the logged in successfully or not");
		
		try {
			if(myAccountObj.getSignout().isEnabled()) {
				logger.log(LogStatus.PASS, "Successfully loogged in");
			}
		} 
		catch(Exception e) {
			logger.log(LogStatus.ERROR, "Failed to logged in");
		}
		
	}
	
	@Test(groups= {"signin", "smoke", "regression"}, enabled=false)
	void signInTestcase002() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");
		
		homeObj.getSignInLink().click();
		logger.log(LogStatus.INFO, "Clicked on the SignIn link");
		
		authObj.setEmailaddressSignIn(prop.getProperty("username"));
		authObj.setPassword("12345678");
		authObj.getSigninbutton().click();
		logger.log(LogStatus.INFO, "Entered username and password");
		
		logger.log(LogStatus.INFO, "Verify the logged in successfully or not");
		
		try {
			if(myAccountObj.getSignout().isEnabled()) {
				logger.log(LogStatus.PASS, "Successfully loogged in");
				Assert.assertTrue(true);
			} 
		}
		catch(Exception e ) {
			logger.log(LogStatus.FAIL, "Failed to logged in");
			Assert.assertTrue(false);
		}
	}
	
	@Test
	void contactUsTestcase001() {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "running");
		
		homeObj.getContactUs().click();
		logger.log(LogStatus.INFO, "Clicked on the Contact us link");
		
		String contactUsPageText = "CUSTOMER SERVICE - CONTACT ";
		String webPageText = contactusObj.getContactUsPageText().getText();
		
		
		if(contactUsPageText.equals(webPageText)) {
			logger.log(LogStatus.PASS, "Successfully Verified the contact us text");	
			Assert.assertTrue(true);
		} else {
			logger.log(LogStatus.FAIL, "Unable to Verify the contact us text hence test case is failed");
			Assert.assertTrue(false);			
		}
		
		
	}
		
		
}
	
