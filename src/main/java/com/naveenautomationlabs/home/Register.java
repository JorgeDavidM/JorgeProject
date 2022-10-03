package com.naveenautomationlabs.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.naveenautomationlabs.base.Base;

public class Register extends Base {

	public Register(WebDriver driver) {
		super(driver);
	}
	
	//Objects
	@FindBy(css = "a[title='My Account']")
	private WebElement myAccountLink;
	
	By myAccount = By.xpath("//ul[@class='list-inline']/li[2]");
	By register = By.linkText("Register");
	By mainText = By.cssSelector("#content h1");
	By firstName = By.id("input-firstname");
	By lastName = By.id("input-lastname");
	By email = By.id("input-email");
	By phone = By.id("input-telephone");
	By password = By.id("input-password");
	By conmfirmPassword = By.id("input-confirm");
	By subscribeYes = By.xpath("(//div[@class='form-group']/div/label/input)[1]");
	By subscribeNo = By.xpath("(//div[@class='form-group']/div/label/input)[2]");
	By checkPolicy = By.name("agree");
	By continueBtn = By.cssSelector("input.btn.btn-primary");
	
	//WrapMethods
	public void gotoRegister() {
		myAccountLink.click();
		waitForElementPresent(myAccount);
//		click(myAccount);
		waitForElementPresent(register);
		click(register);
		waitForElementPresent(mainText);
	}

}
