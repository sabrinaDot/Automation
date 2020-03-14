package Sabrina.brina;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		String baseUrl = "https://www.toolsqa.com/iframe-practice-page/";
		driver.get(baseUrl);
		driver.findElement(By.id("cookie_action_close_header")).click();
		
	
		//to get the number of frames
	List<WebElement>iframeElements = driver.findElements(By.tagName("iframe"));
	System.out.println(iframeElements.size());
		for(int i =0; i<iframeElements.size();i++) {
		System.out.println(i);
		
		//to get the attribute of iframes
		int index = 0;
		List<WebElement>iframeElement = driver.findElements(By.tagName("iframe"));
		for(WebElement iframe: iframeElement) {
			System.out.println((index++)+ ":" + iframe.getAttribute("id"));
		}
	//by index	
	driver.switchTo().frame(2);
		
	//by name or id
	driver.switchTo().frame("aswift_6");
	
	//by webelement
	WebElement frame = driver.findElement(By.xpath("//ins[@id=\"aswift_5_anchor\"]//iframe"));
	
	//switch to default content
	driver.switchTo().defaultContent();
			
	driver.close();
	}
	}
}
