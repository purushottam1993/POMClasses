package srcJava;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage extends BaseClass {

	//All the locators of page
	@FindBy(xpath="//input[@name='username']")
	WebElement userName;
		
	@FindBy(xpath="//input[@name='password']")
	WebElement passWord;
		
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
		
	@FindBy(xpath="//title[text()='OrangeHRM']")
	WebElement title;
	
	@FindBy(xpath="//h5[text()='Login']")
	WebElement textLogin;
		
	//Initialization of Locator(How will you tell the driver to run only this page?)
	public LoginPage(WebDriver driver) {//local driver
	this.driver = driver;//(global driver and local driver hard link
	PageFactory.initElements(driver,this);//(initElement method initialized element of current page in a sequential manner
	//(without page factory sequence get miss matched and script get failed).		                              // and takes driver instance of given class.
	}
		public void loginMethod() {
			userName.sendKeys("Admin");	
			passWord.sendKeys("admin123");
			btnLogin.click();
		}
		public String loginTitle() {
			return title.getText();
		}
		public String textLogin() {
			return textLogin.getText();
		}
	}

