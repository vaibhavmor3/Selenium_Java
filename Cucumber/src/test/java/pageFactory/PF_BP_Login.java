package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PF_BP_Login {
	
	@FindBy(id = "username")
	WebElement txt_LoginName;
	
	@FindBy(id = "password")
	WebElement txt_LoginPassword;
	
	@FindBy(xpath = "//*[@onclick='login()']")
	WebElement btn_LogIN;
	
	WebDriver driver;
	
	public PF_BP_Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		//To avoid Ajax page element stale exception issue
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		//single shot -->PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	public void enterYourLogin(String username)
	{
		txt_LoginName.sendKeys(username);
	}
	
	public void enterYourPassword(String password)
	{
		txt_LoginPassword.sendKeys(password);
	}
	
	public void LoginClick()
	{
		btn_LogIN.click();
	}
	
}
