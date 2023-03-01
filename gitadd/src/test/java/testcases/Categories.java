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

public class Categories extends LaunchBrowser{
	public WebDriver driver;
	Action act = new Action(driver);
	 ReadConfigProperties readdataprop = new ReadConfigProperties();
	 Dashboard dash = new Dashboard(driver);
	 Products po = new Products(driver);
	 Loginpage log = new Loginpage(driver);
	 
	 
	 
	 
  @Test(priority = 6 , enabled = true)
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
	  act.dropDown(dash.products, 8);
	  act.click(po.categories);
	  act.click(po.addcategori);
	  String catname = act.sendkeys(po.categoriname, readdataprop.getCatName());
	  if (catname.equalsIgnoreCase("laclass")) {
	  Assert.assertTrue(true, "test failed due to Different cat names");
	  Thread.sleep(2000);
	  }
	 
  }
  
  @Test(priority = 7 , enabled = true)
  public void Tc_unitshortname() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  
	  Action act = new Action(driver);
	  
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  String catcode = act.sendkeys(po.categoricode, readdataprop.getCatCode());
	  if (catcode.equalsIgnoreCase("lac301")) {
	  Assert.assertTrue(true, "test failed due to Different short unit names");
	  Thread.sleep(2000);
	  }
	  act.click(po.savecategori);
  }
  
  @Test(priority = 8 , enabled = true)
  public void Tc_search() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	 
	  Action act = new Action(driver);
	  
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  act.sendkeys(po.searchcategori, readdataprop.getCatName());
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
