package dec_28;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://automationpractice.com/");
//		//id
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Hello");
//		
//		//name
//		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Hi");
//		
//		//class
//		driver.findElement(By.xpath("//input[@class='search_query form-control ac_input']")).sendKeys("How r u");
//		
//		
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		
//		//and
//		driver.findElement(By.xpath("//input[@id='search_query_top' and @class='search_query form-control ac_input']")).sendKeys("entered using and key word");
//		
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		
//		//or
//		driver.findElement(By.xpath("//input[@id='search_query_top' or @class='search_query form-control ']")).sendKeys("entered using OR key word");
//		
//		//any tag ex: *
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		driver.findElement(By.xpath("//*[@id='search_query_top']")).sendKeys("entered text using anytag id *");
//		
//		//contains
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		driver.findElement(By.xpath("//input[contains(@id,'search_query')] ")).sendKeys("entered text using contains");
//		
//		//contains
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		driver.findElement(By.xpath("//a[contains(@title,'Contact us')]")).click();
//		
//		//starts-with
//		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
//		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("starts with key word");
//		
		//following input
		driver.findElement(By.xpath("//input[@id='search_query_top']")).clear();
		driver.findElement(By.xpath("//a[contains(@title,'Log in to your customer account')]")).click();
		driver.findElement(By.xpath("(//input[@id='email']//following::input)[1]")).sendKeys("using following input method");
		
		//ancestor
		String loginText = driver.findElement(By.xpath("//input[@id='email']//ancestor::form/h3")).getText();
		System.out.println(loginText);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
