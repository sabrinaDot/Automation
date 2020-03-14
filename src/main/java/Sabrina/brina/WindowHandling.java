package Sabrina.brina;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl="http://demo.guru99.com/popup.php";
		driver.get(baseUrl);
		
		WebElement clickHereButton = driver.findElement(By.xpath("//a[@target=\"_blank\"]"));
		clickHereButton.click();
		
		String mainWindow = driver.getWindowHandle(); 
		 Set<String> allWindows = driver.getWindowHandles();
		 //to find out how many windows are there
		 System.out.println(allWindows.size());
		 
		 for(String windows:allWindows) {
			 Thread.sleep(2000);
			 
			 if(!windows.contentEquals(mainWindow)) {
				 driver.switchTo().window(mainWindow);
				  driver.close();
			 }
		 }
		 
		 
	}

}
