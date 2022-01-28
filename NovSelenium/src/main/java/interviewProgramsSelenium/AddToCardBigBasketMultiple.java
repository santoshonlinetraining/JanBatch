package interviewProgramsSelenium;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCardBigBasketMultiple {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chrome\\chromedriver.exe");
			WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/ps/?q=vegetables");
		String[] vegetables = {"Ladies Finger", "Cucumber"};
		
		List<WebElement> vegetablesList = driver.findElements(By.xpath("//div[@qa='product_name']//a[@class='ng-binding']"));
		
		for(int i=0;i<=vegetablesList.size()-1;i++) {
			System.out.println(vegetablesList.get(i).getText());
			
			List vegList = Arrays.asList(vegetables);
			
			System.out.println(vegList);
			if(vegList.contains(vegetablesList.get(i).getText())) {
				System.out.println("found : " + vegetablesList.get(i).getText());
				String elements = "//a[text()='"+vegetablesList.get(i).getText()+"']/parent::div[@class='col-sm-12 col-xs-7 prod-name']/following-sibling::div[@class='col-sm-12 col-xs-12 add-bskt']//button[@qa='add']";
				System.out.println(elements);
				Thread.sleep(5000);
				driver.findElement(By.xpath(elements)).click();
				
			} else {
				System.out.println(" not found : " + vegetablesList.get(i).getText());
				//System.out.println("not found " + vegList.get(i));
			}
		}
	}
}

