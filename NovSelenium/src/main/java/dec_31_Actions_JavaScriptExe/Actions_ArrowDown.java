package dec_31_Actions_JavaScriptExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions_ArrowDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.co.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Colgate");
		Thread.sleep(5000);
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		
		
	}

}
