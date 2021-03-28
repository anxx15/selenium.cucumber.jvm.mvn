package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Steps {
    public static WebDriver driver;

    @Given("user launches the application ")
    public void user_launches_the_application() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/data/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://senecaacademia.herokuapp.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @When("user enters credentials  and ")
    public void user_enters_credentials_and() {

    }
    @Then("verify user enters homepage ")
    public void verify_user_enters_homepage() {
    driver.close();
    }

}
