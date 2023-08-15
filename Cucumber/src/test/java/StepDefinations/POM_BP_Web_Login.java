package StepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.POM_BP_LoginPage;

public class POM_BP_Web_Login {
	WebDriver driver = null;
	POM_BP_LoginPage login;

	@Given("POM user is on BP travel login page")
	public void pom_user_is_on_bp_travel_login_page() {
		
		System.out.println("I=======I am running from POM=======|");
		
		System.setProperty("webDriver.chrome.driver", "./test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
  
		driver.get("https://bptravel.blueprism.com/login.html");
	}

	@When("^POM user enters valid (.*) and (.*)$")
	public void pom_user_enters_valid_username_and_password(String username, String password) {
		
		 login = new POM_BP_LoginPage(driver);
		
		login.enterUsername(username);
		login.enterPassword(password);
		
		/*
		 * driver.findElement(By.id("username")).sendKeys(username);
		 * driver.findElement(By.id("password")).sendKeys(password);
		 */
	}

	@And("POM click on login button of BP travel page")
	public void pom_click_on_login_button_of_bp_travel_page() throws InterruptedException {
		  Thread.sleep(2000);
		  
		  login.clickLogin();
		  Thread.sleep(1000);
		  
		  //driver.findElement(By.xpath("//*[@onclick='login()']")).click();
	}

	@Then("POM user is able to login in BP")
	public void pom_user_is_able_to_login_in_bp() throws InterruptedException {
		 System.out.println("login successfully");
		    Thread.sleep(2000);
		    driver.quit();
	}

}
