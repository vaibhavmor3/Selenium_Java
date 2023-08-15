package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.PF_BP_Login;

public class PF_BP_Web_Login {
	
	WebDriver driver = null;
	PF_BP_Login pflogin;
	
	@Given("PF user is on BP travel login page")
	public void pf_user_is_on_bp_travel_login_page() {
		
		System.out.println("======This is running from Page Factoty======");
		
		  System.setProperty("webDriver.chrome.driver", "./test/resources/drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
	  
			driver.get("https://bptravel.blueprism.com/login.html");
	}

	@When("^PF user enters valid (.*) and (.*)$")
	public void pf_user_enters_valid_username_and_password(String username, String password) {
		
		pflogin = new PF_BP_Login(driver);
		pflogin.enterYourLogin(username);
		pflogin.enterYourPassword(password);
		
		/*
		 * driver.findElement(By.id("username")).sendKeys(username);
		 * driver.findElement(By.id("password")).sendKeys(password);
		 */
	}

	@And("PF click on login button of BP travel page")
	public void pf_click_on_login_button_of_bp_travel_page() {
		
		pflogin.LoginClick();
		
		// driver.findElement(By.xpath("//*[@onclick='login()']")).click();
	}

	@Then("PF user is able to login in BP")
	public void pf_user_is_able_to_login_in_bp() throws InterruptedException {
		System.out.println("login successfully");
	    Thread.sleep(2000);
	    driver.quit();
	}
	
}
