package test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void verifyLogin() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.loginMethod();//we can directly used that reference of loginPage class.
		Assert.assertEquals(pimPage.titleOfPage(),"PIM");
	}
	@Test
	public void getPageTitle() {
		loginPage.loginMethod();
		String title = driver.getTitle();
		Assert.assertEquals(title,"OrangeHRM");	
	}
	public void VerifyLoginTitle() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.loginTitle();
		Assert.assertEquals(loginPage.textLogin(), "Login");
	}
}
