package dec_31_Actions_JavaScriptExe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.bigbasket.com/");

		driver.findElement(By.tagName(null).id("input")).sendKeys("TOMATO");
		//driver.findElement(By.id("input")).getAttribute("value");
		
		//Java script execution
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String exe = "return document.getElementById(\"input\").value";
		String value = (String) js.executeScript(exe);
		
		System.out.println(value);
		
		
		
		
	}

}
