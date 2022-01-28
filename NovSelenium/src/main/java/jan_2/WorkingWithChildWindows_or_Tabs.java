package jan_2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithChildWindows_or_Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
		System.out.println(driver.getTitle());
		
		String mainWindow = driver.getWindowHandle();
		System.out.println("Main window name " + mainWindow);
		
		Set<String> allWindows =  driver.getWindowHandles();
		System.out.println("All window names " + allWindows);
		
		Iterator<String> it = allWindows.iterator();
		while(it.hasNext()) {
			String windowName = it.next();
			
			if(!mainWindow.equalsIgnoreCase(windowName)) {
				driver.switchTo().window(windowName);
				System.out.println("Title > " + driver.getTitle());
				driver.close();
			}
			
			
			
		}
		
		
		
	}

}
