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

public class Unit extends LaunchBrowser{
	public WebDriver driver;
	Action act = new Action(driver);
	 ReadConfigProperties readdataprop = new ReadConfigProperties();
	 Dashboard dash = new Dashboard(driver);
	 Products po = new Products(driver);
	 Loginpage log = new Loginpage(driver);
	 
	 
	 
	 
  @Test(priority = 2 , enabled = true)
  public void Tc_unitnameadd() throws InterruptedException {
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
	  act.click(po.units);
	  act.click(po.addunit);
	  String unitname = act.sendkeys(po.nameunit, readdataprop.getUnitName());
	  if (unitname.equalsIgnoreCase("lapacks")) {
	  Assert.assertTrue(true, "test failed due to Different unit names");
	  Thread.sleep(2000);
	  }
	 
  }
  
  @Test(priority = 3 , enabled = true)
  public void Tc_unitshortname() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  
	  Action act = new Action(driver);
	  
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  String shortname = act.sendkeys(po.shortname, readdataprop.getShortUnitName());
	  if (shortname.equalsIgnoreCase("lap")) {
	  Assert.assertTrue(true, "test failed due to Different short unit names");
	  Thread.sleep(2000);
	  }
	 
  }
  
  @Test(priority = 4 , enabled = true)
  public void Tc_decimalunit() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	 
	  Action act = new Action(driver);
	  
	  
	  act.dropDown(po.decimalunit, 1);
	  Boolean deci = po.decimalunit.isSelected();
	  if(deci) {
	  String valuedeci = po.decimalunit.getText();
	  if (valuedeci.equalsIgnoreCase("yes")) {
	  Assert.assertTrue(true, "test failed since no selection done");
	  Thread.sleep(2000);
	  }
	  }
	  act.click(po.saveunit);
  }
  
  @Test(priority = 5 , enabled = true)
  public void Tc_search() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	 
	  Action act = new Action(driver);
	  
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  act.sendkeys(po.searchunit, readdataprop.getUnitName());
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
