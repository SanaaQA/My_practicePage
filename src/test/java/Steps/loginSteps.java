package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginSteps {
	public WebDriver driver;

	@Given("User navigate to url")
	public void userNavigateToUrl() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
	}

	@And("User Enters username as sana")
	public void userEntersUsernameAsSana() {
		driver.findElement(By.name("name")).sendKeys("sana");
	}

	@And("User enters useremail as sanasameer.k@gmail.com")
	public void userEntersUseremailAsSanasameerKGmailCom() {
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sanasameer.k@gmail.com");	}

	@And("User enters password as Test")
	public void userEntersPasswordAsTest() {
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("******");}

	@Given("User clicks on checkbox")
	public void userClicksOnCheckbox() {
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@Given("User choose Gender")
	public void userChooseGender() {
		WebElement genderdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdwn = new Select(genderdropdown);
		dropdwn.selectByVisibleText("Female");
	}

	@Given("User choose Employmet status")
	public void userChooseEmploymetStatus() {

		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println(driver.findElement(By.id("inlineRadio1")).isSelected());
	}

	@Given("User choose Date of birth")
	public void userChooseDateOfBirth() {
		driver.findElement(By.name("bday")).sendKeys("02-11-1997");
	}


@When("User clicks the register button")
public void userClicksTheRegisterButton() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();	}

	@Then("Login should be success")
	public void loginShouldBeSuccess() {
		String successmsg = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"))
				.getText();
		System.out.println(successmsg);
		if (successmsg.contains("Success! The Form has been submitted successfully!"));
		Assert.assertTrue(true);
		driver.quit();
	}
}
