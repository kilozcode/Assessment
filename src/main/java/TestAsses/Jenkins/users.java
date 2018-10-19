package TestAsses.Jenkins;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class users {
	@FindBy(xpath=("//*[@id=\"tasks\"]/div[3]/a[2]/b"))
	private WebElement userCreate;
	
	
	public WebElement getuserCreate() {
		return userCreate;
		
	}

}
