package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactusPage {
	
	WebDriver driver;
	
	public ContactusPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// SEND A MESSAGE
	@FindBy(xpath = "//p[contains(text(),'Your message has been successfully sent to our tea')]")
	private WebElement contactUsSuccessMessage;
	
	@FindBy(xpath="//li[contains(text(),'The message cannot be blank.')]")
	private WebElement contactUsErrorMessage;
	
	@FindBy(xpath = "//h1[contains(text(),'Customer service - Contact us')]")
	private WebElement contactUsPageText;
	
	@FindBy(xpath = "//select[@id='id_contact']")
	private WebElement SubjectHeading;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement Emailaddress;

	@FindBy(id = "id_order")
	private WebElement Orderreference;

	@FindBy(xpath = "//input[@id='fileUpload']")
	private WebElement AttachFile;

	@FindBy(xpath = "//textarea[@id='message']")
	private WebElement Message;

	@FindBy(name = "submitMessage")
	private WebElement Sendbutton;

	public WebElement getSubjectHeading() {
		return SubjectHeading;
	}

	public void setSubjectHeading(String val) {
		SubjectHeading.sendKeys(val);
	}

	public WebElement getEmailaddress() {
		return Emailaddress;
	}

	public void setEmailaddress(String val) {
		Emailaddress.sendKeys(val);
	}

	public WebElement getOrderreference() {
		return Orderreference;
	}

	public void setOrderreference(String val) {
		Orderreference.sendKeys(val);
	}

	public WebElement getAttachFile() {
		return AttachFile;
	}

	public void setAttachFile(String val) {
		AttachFile.sendKeys(val);
	}

	public WebElement getMessage() {
		return Message;
	}

	public void setMessage(String val) {
		Message.sendKeys(val);
	}

	public WebElement getSendbutton() {
		return Sendbutton;
	}

	public WebElement getContactUsPageText() {
		return contactUsPageText;
	}

	public WebElement getContactUsSuccessMessage() {
		return contactUsSuccessMessage;
	}

	public WebElement getContactUsErrorMessage() {
		return contactUsErrorMessage;
	}

	
}
