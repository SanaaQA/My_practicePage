package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShoppingSteps {
	public WebDriver driver;

	@Given("User Navigates to URL")
	public void userNavigatesToURL() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	}
	
	@Given("User clicks on shop")
	public void userClicksOnShop() throws InterruptedException {
	    driver.findElement(By.linkText("Shop")).click();
	    Thread.sleep(3000);
	}
	@And("Added an item to the cart")
	public void addedAnItemToTheCart() {
	    
	}
	@And("Clicks on Checkout")
	public void clicksOnCheckout() {
	    
	}
	@Then("The Order is placed")
	public void theOrderIsPlaced() {
	   
	}

}
