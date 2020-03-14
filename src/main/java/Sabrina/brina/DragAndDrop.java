package Sabrina.brina;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://demoqa.com/droppable/";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
						
		WebElement boxOne = driver.findElement(By.id("draggable"));
		WebElement boxTwo = driver.findElement(By.id("droppable"));
		
		Actions dragAndDrop =new Actions(driver);
		dragAndDrop.dragAndDrop(boxOne, boxTwo).perform();
		driver.quit();
		
	}

}
