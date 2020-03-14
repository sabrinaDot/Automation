package Sabrina.brina;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		String baseUrl="http://demo.guru99.com/test/newtours/register.php";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
		WebElement firstName = driver.findElement(By.xpath(" /html[1]/body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[5]/td[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]"));
		firstName.sendKeys("Sabrina");
		
		WebElement lastName = driver.findElement(By.xpath("//td//input[@name='lastName']"));
		lastName.sendKeys("Mohammad");
		
		WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("4072834023");
		
		WebElement email = driver.findElement(By.id("userName"));
		email.sendKeys("sabrishah007@gmail.com");
		
		WebElement address = driver.findElement(By.xpath("//input[contains(@name, \"address1\")]"));
		address.sendKeys("Orlando,florida");
		
		WebElement city = driver.findElement(By.cssSelector("input[name=city]"));
		city.sendKeys("Orlando");
		
		WebElement state = driver.findElement(By.cssSelector("input[name=state]"));
		state.sendKeys("Florida");
		
		WebElement postalCode = driver.findElement(By.cssSelector("input[name=postalCode]"));
		postalCode.sendKeys("34741");
		
		WebElement dropDown = driver.findElement(By.cssSelector("select[name=country]"));
		Select country = new Select(dropDown);
		country.selectByValue("UNITED STATES");
		
		WebElement userName = driver.findElement(By.id("email"));
		userName.sendKeys("sabrina");
		
		WebElement password = driver.findElement(By.cssSelector("input[name = password]"));
		password.sendKeys("apple");
		
		WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
		confirmPassword.sendKeys("apple");
		
		WebElement submitButton = driver.findElement(By.name("submit"));
		submitButton.click();
		
		driver.switchTo().frame("flow_close_btn_iframe");
		driver.findElement(By.id("closeBtn")).click();
		driver.switchTo().defaultContent();
		
		WebElement text = driver.findElement(By.xpath("//table[@width=\"492\"]"));
		
		if(text.isDisplayed()) {
			String actualText = text.getText().trim().replaceAll("\\n+", " ");
			
			String expectedText = "Dear Sabrina Mohammad, Thank you for registering. You may now sign-in using the user name and password you've just entered. Note: Your user name is sabrina.";
			
			if(actualText.contains(expectedText)) {
				System.out.println("test passed");
			}else {
				System.out.println("confirmation message did not match");
		}driver.close();
		
		}
		
		}
	
	
		
		
	}
				
			
								
		
		 
		
	


