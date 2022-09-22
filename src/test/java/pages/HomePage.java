package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void PrintaEvidencia() throws IOException {
        driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
        TakesScreenshot takeShot = (TakesScreenshot)driver;
        File file = takeShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/Evidencias/Image.png"));
    }
}
