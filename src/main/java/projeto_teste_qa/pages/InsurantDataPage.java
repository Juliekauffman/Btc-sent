package projeto_teste_qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsurantDataPage {
	
	 WebDriver driver;

	    public InsurantDataPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(id = "make") // Exemplo de um campo do formulário
	    WebElement makeDropdown;

	    @FindBy(id = "model")
	    WebElement modelDropdown;

	    @FindBy(id = "cylindercapacity")
	    WebElement cylinderCapacityInput;

	    @FindBy(id = "nextenterinsurantdata")
	    WebElement nextButton;

	    public void fillVehicleDataForm() {
	        makeDropdown.sendKeys("Audi");
	        modelDropdown.sendKeys("Scooter");
	        cylinderCapacityInput.sendKeys("1500");
	        // preencher os outros campos
	    }

	    public void pressNext() {
	        nextButton.click();
	    }

}
