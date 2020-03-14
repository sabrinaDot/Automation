package Sabrina.brina;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ClassWork {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		String baseUrl = "https://www.toolsqa.com/iframe-practice-page/";
		driver.get(baseUrl);
		
		WebElement acceptButton = driver.findElement(By.id("cookie_action_close_header"));	
		acceptButton.click();
		
		int index =0;
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		for(WebElement allFrames:frames) {
			System.out.println((index++)+":"+allFrames.getAttribute("id"));
		}
		driver.switchTo().frame("6");
		driver.close();
		
				
		
			}
		
		

	}


