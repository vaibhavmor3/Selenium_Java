package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM_BP_LoginPage {

		WebDriver driver;	
		By txt_username = By.id("username");	
		By tx_password = By.id("password");		
		By btn_login = By.xpath("//*[@onclick='login()']");
		
		public POM_BP_LoginPage(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void enterUsername(String username)
		{
			driver.findElement(txt_username).sendKeys(username);
		}
		
		public void enterPassword(String password)
		{
			driver.findElement(tx_password).sendKeys(password);
		}
		
		public void clickLogin()
		{
			driver.findElement(btn_login).click();
		}
		
		//below code is additional
		/*
		 * public void ValidUser(String username, String password) {
		 * driver.findElement(txt_username).sendKeys(username);
		 * driver.findElement(tx_password).sendKeys(password);
		 * driver.findElement(btn_login).click(); }
		 */
		
}
