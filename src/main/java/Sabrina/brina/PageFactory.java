package Sabrina.brina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class PageFactory {
    WebDriver driver;

    @FindBy(id = "flight-returning-hp-flight")
    WebElement returningDateElm;

    @FindBy(id ="tab-flight-tab-hp")
    WebElement flightButtonElm;

    @FindBy(id = "flight-origin-hp-flight")
    WebElement flyingFromElm;

    @FindBy(id = "flight-destination-hp-flight")
    WebElement flyingToElm;

    @FindBy(id = "flight-departing-hp-flight")
    WebElement departingDateElm;

    public PageFactory(WebDriver driver){
    this.driver = driver;
    }

    public void enterDepartingDate( String date) {departingDateElm.sendKeys(date);}
    public void enterFlyingFrom( String location) {
    flyingFromElm.sendKeys(location);
    }
    public void enterFlyingTo( String location) {
    flyingToElm.sendKeys(location);
    }
    public void enterReturningDate(String date) {
    returningDateElm.sendKeys("date");
    }
    public void clickFlightButton() {
    flightButtonElm.click();
    }

    public void testingPageFactory(String location, String date){
    this.clickFlightButton();
    this.enterFlyingFrom("orlando,florida");
    this.enterFlyingTo("dhaka,bangladesh");
    this.enterDepartingDate("03/10/2020");
    this.enterReturningDate("04/10/2020");

    }


    }