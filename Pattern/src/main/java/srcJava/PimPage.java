package srcJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PimPage extends BaseClass {

	@FindBy(xpath="//h6[text()='PIM']")
	WebElement title;
	
	@FindBy(xpath="//div[text()='Jasmine ']//parent::div//preceding-sibling::div//div[@class='oxd-checkbox-wrapper']")
	WebElement checkBox;
	
	public PimPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public String titleOfPage() {
		return title.getText();
	}
	public boolean VerifyCheckBoxIsChecked() {
		return checkBox.isSelected();
	}
}
