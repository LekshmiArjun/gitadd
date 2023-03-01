package testcases;

import org.testng.annotations.Test;

import elements.Loginpage;
import utilities.Action;
import utilities.LaunchBrowser;
import utilities.ReadConfigProperties;
import utilities.WaitConditions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Loginpagetest extends LaunchBrowser {
	public WebDriver driver;
	ReadConfigProperties readdataprop = new ReadConfigProperties();
	Loginpage log = new Loginpage(driver);
	Action act = new Action(driver);
	
	
	
  @Test(priority = 0 , enabled = true)
  public void Tc_username() throws InterruptedException {
	  this.driver = super.driver;
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
		Loginpage log = new Loginpage(driver);
		Action act = new Action(driver);
//	  log.username.sendKeys(readdataprop.getUserName());
//	  String actualname = log.username.getText();
	  String actualname = act.sendkeys(log.username, readdataprop.getUserName());
	  String expectedname = "admin";
	  Assert.assertEquals(actualname, expectedname, "Test failed as both username is incorrect");	
	  Thread.sleep(2000);
	  
  }
  
  @Test(priority = 1 , enabled = true)
  public void Tc_password() throws InterruptedException {
	  this.driver = super.driver;
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  Action act = new Action(driver);
	  Loginpage log = new Loginpage(driver);
//	  log.password.sendKeys(readdataprop.getPwd());
//	  String actualpass = log.password.getText();
	  String actualpass = act.sendkeys(log.password, readdataprop.getPwd());
	  String expectedpass= "123456";
	  Assert.assertEquals(actualpass, expectedpass, "Test failed as both password is incorrect");
	  Thread.sleep(2000);
//	  log.loginbutton.click();
	  act.click(log.loginbutton);	
	  Thread.sleep(2000);
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  launchingBrowser( readdataprop.getUrl(),  readdataprop.getBrowser());
	  this.driver= super.driver;
}

  @AfterTest
  public void afterTest() {
	  closeBrowser();
	  this.driver= super.driver;
  }

}
