package STEPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;

	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	@When("User opens URL {string}")
	public void user_opens_url(String givenURL) {
		driver.get(givenURL);
		driver.manage().window().maximize();

	}

	@When("User Enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String USERNAME, String PASSWORD) throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(USERNAME);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PASSWORD);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);

	}

	@Then("Navigate to Job Page")
	public void navigate_to_job_page() {
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
		driver.findElement(By.xpath("(//a[@role='menuitem'])[1]")).click();

	}
	

	@When("Add Job Records with Jobname as {string} and Jobdescription as {string} Jobnote {string}")
	public void add_job_records_with_jobname_as_and_jobdescription_as_jobnote(String JobTitle, String JobDescr,String JobNote) throws Throwable {
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle);
		driver.findElement(By.xpath("(//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[1]")).sendKeys(JobDescr);
		driver.findElement(By.xpath("(// textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical'])[2]")).sendKeys(JobNote);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(5000);

	}

	@When("Click on logout button")
	public void click_on_logout_button() {
		
		System.out.println("Logged out");

	}

	@Then("Close Browser")
	public void close_browser() {
		
		System.out.println("Browser closed");

	}

}
