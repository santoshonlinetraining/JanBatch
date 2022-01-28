package dec_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/attributes/button-disabled/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(driver.findElement(By.xpath("//*[@id=\"post-76\"]/div/div[2]/button")).isDisplayed()) {
			System.out.println("Button is Displayed on WebPage");
		} else {
			System.out.println("Button NOT Displayed on WebPage");
		}
		
	}
}
