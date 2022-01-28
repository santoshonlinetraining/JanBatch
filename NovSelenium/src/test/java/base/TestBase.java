package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import listener.EventListener;
import pages.AboutUs;
import pages.AuthenticationPage;
import pages.ContactusPage;
import pages.CreateAccountPage;
import pages.FooterLinksPage;
import pages.HeaderLinksPage;
import pages.HomePage;
import pages.MyAccountPage;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import java.io.File;

public class TestBase {
	public WebDriver driver;
	public AboutUs aboutUsObj;
	public AuthenticationPage authObj;
	public ContactusPage contactusObj;
	public CreateAccountPage createAccountObj;
	public FooterLinksPage footerLinksObj;
	public HeaderLinksPage headerLinksObj;
	public HomePage homeObj;
	public MyAccountPage myAccountObj;
	public Properties prop;
	public FileInputStream fis;
	public Logger log = LogManager.getLogger();
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeMethod(groups= {"search", "regression", "smoke", "signin"})
	public void openBrowser() throws IOException {
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties") ;
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+prop.getProperty("chromeDriver"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1080","--ignore-certificate-errors");
			driver = new ChromeDriver(options);
		}
		else if(prop.getProperty("browser").equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\edge\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Automation\\Workspace_new\\NovSelenium\\drivers\\firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("provided browser is not matching, hence unable to execute the testcases");
			System.exit(0);
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		//class file which we created in above step
		EventListener ecapture = new EventListener(); 
		
		//pass the driver to EventFiringWebDriver
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
		
		//pass ecapture tp eventHandler
		eventHandler.register(ecapture);
		
		aboutUsObj = new AboutUs(eventHandler);
		authObj = new AuthenticationPage(eventHandler);
		contactusObj = new ContactusPage(eventHandler);
		createAccountObj = new CreateAccountPage(eventHandler);
		footerLinksObj = new FooterLinksPage(eventHandler);
		headerLinksObj = new HeaderLinksPage(eventHandler);
		homeObj = new HomePage(eventHandler);
		myAccountObj = new MyAccountPage(eventHandler);
	}
	
	@AfterMethod(groups= {"search", "regression", "smoke", "signin"})
	public void closeBrowser() {
		driver.quit();
		extent.endTest(logger);
		extent.flush();
	}
	
	@BeforeTest
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReport.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\extent-config.xml"));
	}
	
	@AfterTest
	public void testafter() {
		extent.close();
	}
}
