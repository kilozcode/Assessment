package TestAsses.Jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Adminlog {
	@FindBy(xpath="//*[@id=\"j_username\"]")
	private WebElement adminName;
	
	@FindBy(xpath="/html/body/div/div/form/div[2]/input")
	private WebElement adminPass;
	
	public WebElement getAdminName() {
		return adminName;
	}
	
	public WebElement getAdminPass() {
		return adminPass;
	}

}
