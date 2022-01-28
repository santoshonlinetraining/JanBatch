package temp_test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccountUsingExplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.linkText("Sign in")).click();
		
		driver.findElement(By.id("email_create")).sendKeys("digitalcutlet51@gmail.com");
		
		driver.findElement(By.id("SubmitCreate")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender2")));
		
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Digital");
		driver.findElement(By.id("customer_lastname")).sendKeys("Cutlet");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		
		//Method 1
//		driver.findElement(By.id("days")).sendKeys("1  ");
//		driver.findElement(By.id("months")).sendKeys("January ");
//		driver.findElement(By.id("years")).sendKeys("2010  ");
		
		//By selectByVisibleText
		Select day = new Select(driver.findElement(By.id("days")));
		day.selectByVisibleText("1  ");
		
		//By selectByIndex
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByIndex(4);
		
		//By selectByValue
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("2015");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("newsletter")).click();
		
		boolean newsLetterCheckBoxStatus = driver.findElement(By.id("newsletter")).isSelected();
		if(newsLetterCheckBoxStatus == false) {
			driver.findElement(By.id("newsletter")).click();
		}
		
		
		driver.findElement(By.id("company")).sendKeys("DC");
		driver.findElement(By.id("address1")).sendKeys("Ameerpet");
		driver.findElement(By.id("address2")).sendKeys("Haythnagar");
		driver.findElement(By.id("city")).sendKeys("Hyd");
		
		driver.findElement(By.id("id_state")).sendKeys("Alabama");
		driver.findElement(By.id("postcode")).sendKeys("12345");
		
		driver.findElement(By.id("id_country")).sendKeys("United States");
		
		driver.findElement(By.id("phone_mobile")).sendKeys("1234567890");
		
		driver.findElement(By.id("alias")).sendKeys("Hyderabad");
		
		//driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
