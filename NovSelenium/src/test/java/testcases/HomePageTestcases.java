package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTestcases extends TestBase {

	@Test(groups= {"search", "smoke", "regression"})
	public void searchTestcase001() {
		homeObj.setSearchTextBox("Jeans");
		homeObj.getButton().click();
		
		String resultSearchText = homeObj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
	}
	
	@Test(groups= {"search", "regression"})
	public void searchTestcase002() {
		homeObj.setSearchTextBox("Shirt");
		homeObj.getButton().click();
		
		String resultSearchText = homeObj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
		
	}
	
	@Test(groups= {"search", "regression"})
	public void searchTestcase003() {
		homeObj.setSearchTextBox("T Shirt");
		homeObj.getButton().click();
		
		String resultSearchText = homeObj.getSearchTextBox().getAttribute("value");
		System.out.println("Search value is " + resultSearchText);
		
	}

	
}

