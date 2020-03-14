package Sabrina.brina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseUrl="http://demo.guru99.com/test/radio.html";
		driver.get(baseUrl);
		
	
		//with for loop
		
			
			for(int i=1; i<3; i++) {
				WebElement radioButton = driver.findElement(By.id("vfb-7-1"));
		radioButton.click();
			}	
			for(int i=0; i<=2; i++) {
				WebElement checkBoxes = driver.findElement(By.id("vfb-6-0"));
				checkBoxes.click();
			}
			
			/*WebElement radioBox= driver.findElement(By.id("vfb-7-1"));
			radioBox.click();
			
			WebElement checkBox = driver.findElement(By.id("vfb-6-0"));
			checkBox.click();
		
			checkBox = driver.findElement(By.id("vfb-6-1"));
			checkBox.click();

			checkBox = driver.findElement(By.id("vfb-6-2"));
			checkBox.click();*/
	
			//System.out.println(radioButton.isSelected());
	
	}
	}

