package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

public class CreateAccountTestcases extends TestBase {

	@Test
	void createAccountTest001() {
		homeObj.getSignInLink().click();
		authObj.setEmailaddressCreateAccount("digitalcutlet52@gmail.com");
		authObj.getCraeteanaccountbutton().click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1")));
					
				
		createAccountObj.getGenderselectMale().click();
		
		
	}
	
}
