package cucumberJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnnotationSteps {
	
	WebDriver driver;



@Given("^I have opened a browser$")
public void i_have_opened_a_browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:/chromedriver2_43/chromedriver.exe");
	driver = new ChromeDriver();
	
    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    driver.get("https://www.google.fr");
}

@Given("^I search for floorball France$")
public void i_search_for_floorball_France() throws Throwable {
    driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("France Floorball"); 
    driver.findElement(By.xpath("//form[@id='tsf']/div[2]/div/div[3]/center/input[1]")).submit();
}

@When("^I click on the french floorball federation website$")
public void i_click_on_the_french_floorball_federation_website() throws Throwable {
    driver.findElement(By.xpath("//div/a[contains(@href,'www.floorball.fr')]/h3")).click();
}

@Then("^the menu ou pratiquer is clickable$")
public void the_menu_is_clickable() throws Throwable {
    driver.findElement(By.xpath("//div[@id='colgauche']/div[2]/p[7]/a/img")).click();
}
}
