package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Generico {
    WebDriver driver;

    public Generico (WebDriver driver) {
        this.driver = driver;
    }

    public void PrintaEvidencia() throws IOException {
        Date currentdate = new Date();
        String screenShotFileName = currentdate.toString().replace(" ","-").replace(":","-");
//        driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
        TakesScreenshot takeShot = (TakesScreenshot)driver;
        File file = takeShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("src/Evidencias/"+screenShotFileName+".png"));
    }
}
