package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class PinterestAutomation {
    public WebDriver driver;

    @BeforeClass
    public void initialSetup(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void verifyFunctions(){
      driver.get("https://www.pinterest.com/");
      driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        By signUpButton = By.xpath("//div[contains(text(),'Sign up')]");
        By email = By.id("email");
        By password = By.id("password");
        By age = By.id("age");
        By continueButton = By.xpath("//div[contains(text(),'Continue')]");

        clickSignUpButton(signUpButton);
        clickEmail(email, "brinaresh1@gmail.com");
        clickOnPassword(password, "apple");
        clickOnAge(age, "10");
        clickContinueButton(continueButton);
    }
    public void clickContinueButton(By continueButton) {
        WebElement continueBtn = driver.findElement(continueButton);
        continueBtn.click();
    }
    public void clickOnAge(By age, String text) {
        WebElement ageText = driver.findElement(age);
        ageText.sendKeys(text);
    }
    public void clickOnPassword(By password,String text) {
        WebElement passwordText = driver.findElement(password);
        passwordText.sendKeys(text);
    }
    public void clickEmail(By email, String text) {
        WebElement emailText = driver.findElement(email);
        emailText.sendKeys(text);
    }
    public void clickSignUpButton(By signUpButton) {
        WebElement signUp = driver.findElement(signUpButton);
        signUp.click();
    }

    @AfterClass
    public void closingThePage(){
        driver.quit();
    }
}
