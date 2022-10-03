package com.naveenautomationlabs.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

	protected WebDriver driver;
    protected WebDriverWait wait;

    public Base(WebDriver driver) {
        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        PageFactory.initElements(driver, this);
    }
	
	public WebDriver chromeDriver() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY,GlobalVariables.CHROME_DRIVER_PATH);
		driver = new ChromeDriver();
		return driver;		
	}
	
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(GlobalVariables.GENERAL_TIMEOUT));
	}
	
	public void waitForElementPresent(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(GlobalVariables.GENERAL_TIMEOUT));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void launchBrowser(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		implicitlyWait();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText(); 
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void sendKeys(By locator,String input) {
		driver.findElement(locator).sendKeys(input);
	}
	
	public void assertEquals(String a, String b) {
		Assert.assertEquals(a, b);
	}
		
}