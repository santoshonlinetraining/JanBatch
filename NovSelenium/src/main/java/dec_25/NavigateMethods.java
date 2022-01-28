package dec_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		NavigateMethods obj = new NavigateMethods();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com/");
		
		driver.findElement(By.linkText("Contact us")).click();
		obj.sleep(1);
		
		driver.navigate().back();
		obj.sleep(1);
		
		driver.navigate().forward();
		obj.sleep(1);
		
		driver.findElement(By.id("email")).sendKeys("santosh@test.com");
		driver.findElement(By.id("id_order")).sendKeys("123456");
		obj.sleep(5);
		
		driver.navigate().refresh();

	}
	
	void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec*1000);
	}

}
