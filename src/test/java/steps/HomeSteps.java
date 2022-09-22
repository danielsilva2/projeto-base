package steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.Before;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.HomePage;
import support.Generico;

public class HomeSteps {
    WebDriver driver;

    @Before
    public void before() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    }

    @Dado("que ao acessar o site DemoQA")
    public void queAoAcessarOSiteDemoQA() {
        driver.get("https://demoqa.com/");
    }

    @Quando("printar a evidencia")
    public void printarAEvidencia() throws IOException {
        Generico generico = new Generico(driver);
        generico.PrintaEvidencia();
    }

    @Entao("fechar o browser")
    public void fecharOBrowser() {
        driver.quit();
    }
}
