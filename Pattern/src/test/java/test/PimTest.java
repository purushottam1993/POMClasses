package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PimTest extends BaseTest {

	@BeforeClass
	public void firstLogin() {
		loginPage.loginMethod();
	}
	@Test
	public void verifyTitle() {
		//String pimText = driver.getTitle();
		Assert.assertEquals(pimPage.titleOfPage(), "PIM");
	}
	@Test
	public void verifyCheckBox() {
		pimPage.VerifyCheckBoxIsChecked();
		Assert.assertEquals(pimPage.VerifyCheckBoxIsChecked(), false);
	}
}
