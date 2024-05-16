package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {
    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Open the browser and navigate to the login page
        System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        driver = new ChromeDriver();
        driver.get("login_page_url");
    }

    @When("I enter valid username and password")
    public void i_enter_valid_username_and_password() {
        // Enter valid username and password into respective fields
        driver.findElement(By.id("username")).sendKeys("valid_username");
        driver.findElement(By.id("password")).sendKeys("valid_password");
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        // Click on the login button
        driver.findElement(By.id("login_button")).click();
    }

    @Then("I should be redirected to the home page")
    public void i_should_be_redirected_to_the_home_page() {
        // Verify if redirected to the home page
        String currentUrl = driver.getCurrentUrl();
        assert(currentUrl.equals("home_page_url"));
        driver.quit(); // Close the browser
    }
}
