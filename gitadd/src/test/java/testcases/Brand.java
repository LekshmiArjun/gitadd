package testcases;

import org.testng.annotations.Test;

import elements.Dashboard;
import elements.Loginpage;
import elements.Products;
import utilities.Action;
import utilities.LaunchBrowser;
import utilities.ReadConfigProperties;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Brand extends LaunchBrowser{
	
	public WebDriver driver;
	Action act = new Action(driver);
	 ReadConfigProperties readdataprop = new ReadConfigProperties();
	 Dashboard dash = new Dashboard(driver);
	 Products po = new Products(driver);
	 Loginpage log = new Loginpage(driver);
	 
	 
  @Test(priority = 0 , enabled = true)
  public void Tc_brand() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Dashboard dash = new Dashboard(driver);
	  Action act = new Action(driver);
	  Loginpage log = new Loginpage(driver);
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  act.sendkeys(log.username, readdataprop.getUserName());
	  act.sendkeys(log.password, readdataprop.getPwd());
	  act.click(log.loginbutton);
	  act.click(dash.endtour);
	  
	  act.click(dash.products);
	  act.click(po.Brands);
	  act.click(po.addbrand);
	  
	  String branname = act.sendkeys(po.brandname, readdataprop.getBrandName());
	  if (branname.equalsIgnoreCase("laclass")) {
	  Assert.assertTrue(true, "test failed due to Different cat names");
	  Thread.sleep(2000);
	  }
  }
  
  
  @Test(priority = 1 , enabled = true)
  public void Tc_brand1() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver); 
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  String brandescr = act.sendkeys(po.shortdescribebrand, readdataprop.getDescribebBrand());
	  act.click(po.savebrand);
	  if (brandescr.equalsIgnoreCase("laclass")) {
	  Assert.assertTrue(true, "test failed due to Different cat names");
	  Thread.sleep(2000);
	  
	  }
  }
	  
	  
  @Test(priority = 2 , enabled = true)
  public void Tc_brand2() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver); 
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  act.sendkeys(po.searchbrand, readdataprop.getBrandName());
	 
	  
	  Thread.sleep(2000);
	  
	  }

  
  
  
@BeforeTest
public void beforeTest() throws InterruptedException {
	  
	  launchingBrowser( readdataprop.getUrl(),  readdataprop.getBrowser());
	  this.driver= super.driver;
	  Thread.sleep(2000); 	
}

@AfterTest
public void afterTest() {
	  closeBrowser();
	  this.driver= super.driver;
}


}
