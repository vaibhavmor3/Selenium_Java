package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class BP_Travel_LoginSteps {
		WebDriver driver = null;
	
	@Given("user is on BP travel login page")
	public void user_is_on_bp_travel_login_page() {
		  System.out.println("Inside Step = User opens the browser");
		  System.setProperty("webDriver.chrome.driver", "./test/resources/drivers/chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
	  
			driver.get("https://bptravel.blueprism.com/login.html");
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username, String password)  {
	    driver.findElement(By.id("username")).sendKeys(username); 
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("click on login button of BP travel page")
	public void click_on_login_button_of_bp_travel_page() {
	    driver.findElement(By.xpath("//*[@onclick='login()']")).click();
	}

	@Then("user is able to login in BP")
	public void user_is_able_to_login_in_bp() throws InterruptedException {
	    System.out.println("login successfully");
	    Thread.sleep(2000);
	    driver.quit();
	}

}
