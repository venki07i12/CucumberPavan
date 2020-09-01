package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMSteps {

	WebDriver driver;
	
	@Given("I luanch chrome browser")
	public void i_luanch_chrome_browser() {
	 
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}

	@When("I open OrangeHRM homepage")
	public void i_open_orange_hrm_homepage() {
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
	boolean status = driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
	Assert.assertEquals(true, status);
	}

	@And("close browser")
	public void close_browser() {
	   driver.quit();
	}

}
