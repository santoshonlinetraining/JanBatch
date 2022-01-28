package jan_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase2 {
	WebDriver driver;
	
	@Test()
	void search() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys("tamato").build().perform();
		Thread.sleep(5000);
	}
	
	@Test(enabled=true)
	void doubleClick() throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		
		Thread.sleep(5000);

	}
	
	@Test()
	void onMouse() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(5000);
		
		/*
		 * if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
		 * driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).
		 * click(); } else { System.out.println("WebElement is not present"); }
		 */
	}
	
	@BeforeMethod
	void beforeMethod() {
		driver.get("https://www.bigbasket.com");
	}
	
	@BeforeClass
	void beforeClass() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bigbasket.com");
	}
	
	@AfterClass
	void afterClass() {
		//driver.close();
	}
	
	@BeforeTest
	void BeforeTest() {
		System.out.println("I am from Before Test");
	}
	
	@AfterTest
	void AfterTest() {
		System.out.println("I am from After Test");
	}
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("i am from Before Suite");
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("i am from after suite");
	}
}
