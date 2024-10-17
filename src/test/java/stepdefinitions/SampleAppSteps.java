package stepdefinitions;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import projeto_teste_qa.pages.InsurantDataPage;
import projeto_teste_qa.pages.PriceOptionPage;
import projeto_teste_qa.pages.ProductDataPage;
import projeto_teste_qa.pages.SendQuotePage;
import projeto_teste_qa.pages.VehicleDataPage;

public class SampleAppSteps {

    WebDriver driver;
    VehicleDataPage vehicleDataPage;
    InsurantDataPage insurantDataPage;
    ProductDataPage productDataPage;
    PriceOptionPage priceOptionPage;
    SendQuotePage sendQuotePage;

    @Given("I am on the vehicle data form page")
    public void i_am_on_the_vehicle_data_form_page() {
    	 // Define o caminho do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");
        vehicleDataPage = new VehicleDataPage(driver);

    }

    @When("I fill the vehicle data form")
    public void i_fill_the_vehicle_data_form() {
        vehicleDataPage.fillVehicleDataForm();
    }

    @And("I press next")
    public void i_press_next() {
        vehicleDataPage.pressNext();
    }

    @Then("I should see {string}")
    public void i_should_see(String expectedMessage) {
        // Implemente a verificação para confirmar se a mensagem é exibida
        boolean isMessageDisplayed = sendQuotePage.isMessageDisplayed(expectedMessage);
        assertTrue(isMessageDisplayed);
        driver.quit();
    }
}
