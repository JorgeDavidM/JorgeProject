package com.naveenautomationlabs.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.naveenautomationlabs.base.Base;

public class Home extends Base {

	public Home(WebDriver driver) {
		super(driver);
	}
	
	//Objects
	By mainSearch = By.name("search");
	
	//WrapMethods

}
