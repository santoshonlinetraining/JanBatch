package dec_28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com/");
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		WebElement searchButton = driver.findElement(By.name("submit_search"));
		
		searchBox.sendKeys("T Shirts");
		searchButton.click();
		driver.get("http://automationpractice.com/");
		
		searchBox.sendKeys("Shirts");
		searchButton.click();
		
		searchBox.sendKeys("Shoe");
		searchButton.click();
		
	}

}
