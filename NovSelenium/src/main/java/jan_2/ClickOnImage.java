package jan_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver apDriver = new ChromeDriver();
		
		apDriver.manage().window().maximize();
		apDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		apDriver.get("http://automationpractice.com/index.php");
		
		apDriver.findElement(By.linkText("Sign in")).click();
		apDriver.findElement(By.xpath("//img[@class='logo img-responsive']")).click();
		

	}

}
