package Sabrina.brina;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class XPathAndCssSelector {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.expedia.com");
	driver.manage().window().maximize();
	
	//leaving from # tagname[attribute = value]
	WebElement element =driver.findElement(By.xpath("//input[@id='package-origin-hp-package']"));
	element.sendKeys("Orlando,Florida");
	
	// going to # tagname[attribute=value and attribute = value]
	WebElement elementTwo = driver.findElement(By.xpath("//input[@type='text' and @ id = 'package-destination-hp-package' ]"));
	elementTwo.sendKeys("cgp");
	Thread.sleep(4000);
		
	// Click on flight tab, xpath starts-with @ attribute,value
	WebElement elementFour = driver.findElement(By.xpath("//button[starts-with(@id, 'tab-flight')]"));
	elementFour.click();
	Thread.sleep(3000);
	
	//click on My List # xpath contains text(),value
	WebElement elementFive = driver.findElement(By.xpath("//span[contains(text(), 'Lists')]"));
	elementFive.click();
	Thread.sleep(3000);
	
	//click on Expedia # CssSelector(tag&attribute)
	WebElement elementThree = driver.findElement(By.cssSelector("[alt=\"expedia logo\"]"));
	elementThree.click();
	
	//click on my trip # xpath//tagname[contain(@attribute,'value)][@name='value']
	driver.getTitle();
	WebElement elementSix = driver.findElement(By.xpath("//a[contains(@class,'nav-tab')][@id=\"header-itineraries\"]"));
	elementSix.click();
	Thread.sleep(3000);
	
	//typing the  email address # CssSelector(tag&id)
	WebElement elementSeven = driver.findElement(By.cssSelector("#unified-itin-emailId"));
	elementSeven.sendKeys("sabrina@gmail.com");
	Thread.sleep(4000);
	
	// click on forgot your initiary number # CssSelector (tag,class&attribute)
	WebElement elementEight = driver.findElement(By.cssSelector(".link[id = forgot-itinerary-link]"));
	elementEight.click();
	Thread.sleep(3000);
	
	//click on My List # CssSelector (tag&class)
	WebElement elementTen = driver.findElement(By.cssSelector(".sp-name"));
	elementTen.click();
	driver.close();
	
	
}}
