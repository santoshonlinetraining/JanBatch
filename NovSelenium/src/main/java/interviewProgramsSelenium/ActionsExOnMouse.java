package interviewProgramsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExOnMouse {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com");

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
	
}
