package Sabrina.brina;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionAndAlert{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String baseUrl = "http://google.com";
		driver.get(baseUrl);
		
		
		WebElement setting = driver.findElement(By.id("fsettl"));
		Actions action = new Actions(driver);
		action.contextClick(setting).perform();
		
		
		WebElement iAmFeelingLucky = driver.findElement(By.xpath("//input[@id='gbqfbb']"));
		
		action.moveToElement(iAmFeelingLucky).doubleClick(iAmFeelingLucky).perform();
		
	}

}
