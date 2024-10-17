package runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import projeto_teste_qa.pages.VehicleDataPage;

public class SeleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webdriver/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions"); // Desativa extensões
        options.addArguments("--incognito"); // Modo incógnito
        options.addArguments("--disable-gpu"); // Desativa a GPU
        options.addArguments("--headless"); // Executa em modo sem cabeça (sem interface gráfica)

        System.setProperty("webdriver.chrome.port", "8088"); // ou outra porta que não esteja em uso

        WebDriver driver = new ChromeDriver(options);
        
        try {
        	 driver.get("http://sampleapp.tricentis.com/101/app.php");
            
            System.out.println("Título da página: " + driver.getTitle());
        } catch (Exception e) {
            e.printStackTrace(); // Para depuração
        } finally {
            driver.quit();
        }
    }
}

