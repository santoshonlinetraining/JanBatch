package dec_25;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.get("http://automationpractice.com/index.php");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				String titleOfthewebPage = driver.getTitle();
				System.out.println(titleOfthewebPage);
				
				String urlOftheWebPage = driver.getCurrentUrl();
				System.out.println(urlOftheWebPage);
				
				String pageSourceOfWebPage = driver.getPageSource();
				System.out.println(pageSourceOfWebPage);
				
	}

}
