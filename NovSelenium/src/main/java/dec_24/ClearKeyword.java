package dec_24;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet11@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.id("id_gender1")).click(); // mr
		
		driver.findElement(By.id("customer_firstname")).sendKeys("Santosh");
		driver.findElement(By.id("customer_lastname")).sendKeys("kumar");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.id("days")).sendKeys("1");
		driver.findElement(By.id("months")).sendKeys("June");
		driver.findElement(By.id("years")).sendKeys("2000");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		//Address
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("lastname")).clear();
		
		driver.findElement(By.id("firstname")).sendKeys("Shiva");
		driver.findElement(By.id("lastname")).sendKeys("Kumar");
		
		driver.findElement(By.id("company")).sendKeys("Digital cutelet");
		
		driver.findElement(By.id("address1")).sendKeys("Ameetpet and Himayathnagar");
		
		driver.findElement(By.id("city")).sendKeys("Hyd");
		
		driver.findElement(By.id("id_state")).sendKeys("Arizona");
		
		driver.findElement(By.id("postcode")).sendKeys("50001");
		
		driver.findElement(By.id("id_country")).sendKeys("United States");
		
		driver.findElement(By.name("other")).sendKeys("slfkjs lksdjf sldkfjsd lfkjsdflksdjfdslfkjsdlfkj");
		
		driver.findElement(By.id("phone")).sendKeys("123456789");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("987654321");
		
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("ref");
		
			
		
		
		
	}
}
