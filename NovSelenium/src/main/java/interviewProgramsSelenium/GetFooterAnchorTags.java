package interviewProgramsSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFooterAnchorTags {
	WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
			WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");
		
		//Big basket links
		System.out.println("==> Big basket links");
		List<WebElement> footerLinks =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[1]//a"));
		for(int i=0; i<footerLinks.size(); i++) {
			System.out.println(footerLinks.get(i).getText());
		}
		
		//Help links
		System.out.println("==> Help links");
		List<WebElement> footerLinks2 =  driver.findElements(By.xpath("(//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper'])[2]//a"));
		for(int i=0; i<footerLinks2.size(); i++) {
			System.out.println(footerLinks2.get(i).getText());
		}

		//Bigbasket and Help links (All links)
		System.out.println("==> Bigbasket and Help links (All links)");
		List<WebElement> footerLinks3 =  driver.findElements(By.xpath("//div[@class='col-md-3 col-sm-6 col-xs-6 col-wraper']//a"));
		for(int i=0; i<footerLinks3.size(); i++) {
			System.out.println(footerLinks3.get(i).getText());
		}

	}
}
