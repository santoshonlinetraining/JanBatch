package dec_30_getText_Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email")).sendKeys("santosh@test.com");
		driver.findElement(By.id("passwd")).sendKeys("1234567");
		driver.findElement(By.id("SubmitLogin")).click();
		
		String errormessage = driver.findElement(By.xpath("//div[@class='alert alert-danger']/ol/li")).getText();
		System.out.println(errormessage);
		
		if(errormessage.equals("Authentication failed.")) {
			System.out.println("error message displayed PASS");
		} else {
			System.out.println("error message NOT displayed Fail");
		}
		
	}

}
