package Sabrina.brina;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookAutomation {
	    public String baseUrl = "https://www.facebook.com/";
	    
	    public WebDriver driver;
	   
	    @BeforeTest
	      public void launchBrowser() {
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\sabri\\Documents\\selenium driver\\selenium driver\\chromedriver.exe");
	 	     driver = new ChromeDriver();
	 		driver.manage().window().maximize();
	        driver.get(baseUrl);
	      }
	      @Test
	      public void verifyHomepageTitle() {
	          String expectedTitle = "Facebook - Log In or Sign Up" ;
	          String actualTitle = driver.getTitle();
	          System.out.println(actualTitle);
	          Assert.assertEquals(actualTitle, expectedTitle);
	     }
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	      }
	}
	

