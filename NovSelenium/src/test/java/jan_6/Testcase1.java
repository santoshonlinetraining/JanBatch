package jan_6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase1 {
	WebDriver driver;
	
	@Test(priority=1)
	@Parameters({"veg1"})
	void search(String vegName) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		act.moveToElement(search).click().keyDown(Keys.SHIFT).sendKeys(vegName).build().perform();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	@Parameters({"veg2"})
	void doubleClick(String vegName) throws InterruptedException {
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		act.moveToElement(search).click().sendKeys(vegName).doubleClick().build().perform();
		
		Thread.sleep(5000);

		act.moveToElement(search).contextClick().build().perform();
	}
	
	@Test(priority=2)
	void onMouse() throws InterruptedException {
		Actions act = new Actions(driver);
		
		WebElement shopByCat = driver.findElement(By.xpath("//a[@class='dropdown-toggle meganav-shop']")); 
		act.moveToElement(shopByCat).build().perform();
	
		Thread.sleep(1000);
		
		if(shopByCat.isDisplayed() && shopByCat.isEnabled()) {
			driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")).click();
		} else {
			System.out.println("WebElement is not present");
		}
	}
	
	
	@BeforeMethod
	void beforeMethod() {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.bigbasket.com");
	}
	
	@AfterMethod
	void afterMethod() {
		driver.close();
	}
	

}
