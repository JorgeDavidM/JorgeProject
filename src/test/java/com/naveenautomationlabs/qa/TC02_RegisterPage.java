package com.naveenautomationlabs.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.naveenautomationlabs.base.Base;
import com.naveenautomationlabs.base.GlobalVariables;
import com.naveenautomationlabs.home.Register;

public class TC02_RegisterPage {
	
	WebDriver driver;
//	Base base;
	Register page;

  @BeforeTest
  public void beforeTest() {
//	  base = new Base(driver);
	  page = new Register(driver);
	  driver = page.chromeDriver();
  }
  
  @Test
  public void TC02_RegisterPage_Script() {
	  //Step 1
	  page.launchBrowser(GlobalVariables.URL);
	  //Step 2
	  page.gotoRegister();
  }

  @AfterTest
  public void afterTest() {
//	  driver.close();
  }

}
