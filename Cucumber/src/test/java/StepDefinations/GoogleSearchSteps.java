package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
WebDriver driver; 			 //both are working fine
//	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   System.out.println("Inside Step = User opens the browser");
	  System.setProperty("webDriver.chrome.driver", "./test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Step = User on google search page");	
		driver.get("https://google.com");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		System.out.println("Inside Step = User enter text in search boxr");		
		driver.findElement(By.name ("q")).sendKeys ("Raghav Pal");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside Step = User hits enter");
		driver. findElement(By.name ("q")).sendKeys (Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside Step = User got search resultsr");
		driver.getPageSource(). contains("Raghav Pal | Automation Test Architect");
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
