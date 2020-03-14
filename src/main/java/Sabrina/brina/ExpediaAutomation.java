package Sabrina.brina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExpediaAutomation {
    public WebDriver driver;

    @BeforeClass
    public void initialSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
   public void verifyExpediaFunctions(){
        driver.get("https://www.expedia.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement flightButton = driver.findElement(By.id("tab-flight-tab-hp"));
        flightButton.click();

        WebElement flyingFrom = driver.findElement(By.id("flight-origin-hp-flight"));
        flyingFrom.sendKeys("Orlando,florida");

        WebElement flyingTo = driver.findElement(By.id("flight-destination-hp-flight"));
        flyingTo.sendKeys("Dhaka,bangladesh");

        WebElement departingDate = driver.findElement(By.id("flight-departing-hp-flight"));
        departingDate.sendKeys("03/09/2020");

        WebElement returningDate = driver.findElement(By.id("flight-returning-hp-flight"));
        returningDate.sendKeys("04/10/2020");

        WebElement searchButton = driver.findElement(By.xpath("//*[@id='gcw-flights-form-hp-flight']//label//button"));
        searchButton.click();

        WebElement text = driver.findElement(By.className("title-city-text"));
        String actualText = text.getText();
       System.out.println(actualText);

       Assert.assertEquals(actualText, "Select your departure to Dhaka");
    }
        @AfterClass
        public void closingTest(){
        driver.quit();
        }


}
