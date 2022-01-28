package interviewProgramsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.UserDataHandler;

import net.bytebuddy.dynamic.loading.ClassInjector.UsingReflection;

public class ActionsExDoubleClick {
	
	//Enter a work in CAPS and select the same
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bigbasket.com");

		
		
		Actions act = new Actions(driver);
		WebElement search = driver.findElement(By.xpath("//input[@id='input']")); 
		
		act.moveToElement(search).click().sendKeys("TOMATO").doubleClick().build().perform();
		
		Thread.sleep(5000);

		act.moveToElement(search).contextClick().build().perform();
	}
	
}
