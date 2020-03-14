package Sabrina.brina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException  {
		System.out.println("lets see if it works!");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		
		String baseURL = "http://www.google.com";
		d.get(baseURL);
		String expectedTitle = "Google";
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.disney.com");
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\iedriverserver.exe");
		WebDriver driver = new InternetExplorerDriver();
		//driver.navigate().to("http://www.universal.com");
		/ */
		
		
		/*String pageTitle = d.getTitle();
		boolean result = pageTitle.equals(expectedTitle);
		System.out.println("page title is  :" +result);
		if(pageTitle.equals(expectedTitle)) {
			System.out.println("right page");
		}else {
			System.out.println("Test failed");
		}*/
	
			//d.get("http://www.disney.com");
		//d.close();
			
	/*	d.findElement(By.name("q")).sendKeys("sabrina"); //find text box and search for selenium
		Thread.sleep(1000);
		//d.findElement(By.name("btnK")).click();
		d.findElement(By.name("q")).clear();
		
		//optimized way of doing the same work.
		WebElement searchBox = d.findElement(By.name("q"));
		searchBox.sendKeys("amazing");
		Thread.sleep(1100);
		
		searchBox.clear();
		searchBox.sendKeys("so much fun");
		Thread.sleep(1000);
		d.findElement(By.name("btnK")).click();*/
		
		//to find element by id
		/*baseURL = "http://accounts.google.com";
		d.get(baseURL);
		WebElement userId = d.findElement(By.id("identifierId"));
		userId.sendKeys("sabrina@gmail.com");*/
		
		baseURL = "http://login.yahoo.com";
		d.get(baseURL);
		
		//d.findElement(By.linkText("data-rapid_p=\"7\"")).click();
		d.findElement(By.cssSelector("#login-username")).sendKeys("sabrina@yahoo.com");
		Thread.sleep(1000);
		d.findElement(By.id("login-signin")).click();
		//d.findElement(By.name("btnK")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

