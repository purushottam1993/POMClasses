package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import srcJava.BaseClass;
import srcJava.LoginPage;
import srcJava.PimPage;

public class BaseTest extends BaseClass {

	public static WebDriver driver;
	protected LoginPage loginPage;
	protected PimPage pimPage;
	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@BeforeClass
	//all method in PageClass is non static. we need to create object of respective class where
	//non static method present. thats why BaseTest class..(if we create object in respective pageclass
	//then that object is limited for only respective method
	public void pageObjects() {
		loginPage = new LoginPage(driver);
		pimPage = new PimPage(driver);
	}
	@AfterMethod
	@AfterClass
		public void tearDown() {
			driver.quit();
		}
	}

