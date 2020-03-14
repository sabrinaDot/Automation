package Sabrina.brina;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAutomation {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl = "https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/";
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement acceptButton = driver.findElement(By.xpath("//a[@id=\"cookie_action_close_header\"]"));
		acceptButton.click();
			
		WebElement confirmPopUp = driver.findElement(By.xpath("//button[contains(text(), 'Confirm Pop up')]"));
		confirmPopUp.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
		
	
		//driver.quit();
			
	}

}
