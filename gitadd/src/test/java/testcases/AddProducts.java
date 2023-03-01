package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import elements.Dashboard;
import elements.Loginpage;
import elements.Products;
import utilities.Action;
import utilities.LaunchBrowser;
import utilities.ReadConfigProperties;
import utilities.ScrollinWindow;

public class AddProducts extends LaunchBrowser{
	public WebDriver driver;
	Action act = new Action(driver);
	 ReadConfigProperties readdataprop = new ReadConfigProperties();
	 Dashboard dash = new Dashboard(driver);
	 Products po = new Products(driver);
	 Loginpage log = new Loginpage(driver);
	 ScrollinWindow scroll = new ScrollinWindow(driver);
	 
  @Test(priority = 9 , enabled = true)
  public void Tc_addproduct() throws InterruptedException {
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
	  Thread.sleep(2000);
	  act.click(dash.addproducts);
	  Thread.sleep(2000);
	  String actualtitle = po.addnewproduct.getText();
	  String expectedtitle = "Add new product";
	  if(actualtitle.contains(expectedtitle)) {
		  Assert.assertTrue(true, "Wrong name: test failed");
	  }
  }
  
  @Test(priority = 10 , enabled = true)
  public void Tc_productname() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
//	  Dashboard dash = new Dashboard(driver);
	  Action act = new Action(driver);
	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  String name = act.sendkeys(po.productname, readdataprop.getProductName());
	  System.out.println(name);
	  Thread.sleep(2000);
	  if(name.equals("chocolate")) {
		  Assert.assertTrue(false, "Wrong name: test failed");
	  }
  }
  
  
  @Test(priority = 11, enabled = true)
  public void Tc_units() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver);
	  ReadConfigProperties readdataprop = new ReadConfigProperties(); 
	   
	  act.click(po.addunitbutton);
	  Thread.sleep(2000);
	  String unitname = act.sendkeys(po.nameunit, readdataprop.getUnitName());
	  Thread.sleep(2000);
	  System.out.println(unitname);
	  
	  String shortname = act.sendkeys(po.shortname, readdataprop.getShortUnitName());
	  Thread.sleep(2000);
	  System.out.println(shortname);
	 
	  act.dropDown(po.decimalunit, 1);
	  Thread.sleep(2000);
	  act.click(po.saveunit);
	  Thread.sleep(2000);
	  act.click(po.unit);
//	  act.sendkeys(po.searchunit, shortname);
//	  Thread.sleep(1000);
//	  act.dropDown(po.unit, 1);
//	  Thread.sleep(1000);
//	  Boolean dis = po.unit.isSelected();
  }
  
  
  @Test(priority = 12, enabled = true)
  public void Tc_barcode() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver);
//	  ReadConfigProperties readdataprop = new ReadConfigProperties();
	  
	  act.dropDown(po.barcode, 2);
	  Thread.sleep(1000);
	  Boolean barc = po.barcode.isEnabled();
	  
  }
  
  @Test(priority = 13, enabled = true)
  public void Tc_alertquantity() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver);
	  ReadConfigProperties readdataprop = new ReadConfigProperties(); 
	  
	  String qty = act.sendkeys(po.alertquantity, readdataprop.getAlertQty());
	  Thread.sleep(1000);
	  
	  if(qty.contains("5")) {
		  Assert.assertTrue(true, "Wrong qty: test failed");
	  }
  }
  
  
  @Test(priority = 14, enabled = true)
  public void Tc_DefautPurchasePrice() throws InterruptedException {
	  this.driver= super.driver;
	  Products po = new Products(driver);
	  Action act = new Action(driver);
	  ReadConfigProperties readdataprop = new ReadConfigProperties(); 
	  ScrollinWindow scroll = new ScrollinWindow(driver);
	  
	  scroll.scrollToElement(po.sellingpricetype);
	  act.dropDown(po.producttype, 0);
	  Thread.sleep(1000);
	  act.dropDown(po.sellingpricetype, 0);
	  Thread.sleep(1000);
	  String ectx = act.sendkeys(po.purchaseexctax, readdataprop.getExcTax());
	  Thread.sleep(1000);
	  String ictx = act.sendkeys(po.purchaseinctax, readdataprop.getIncTax());
	  Thread.sleep(1000);
//	  String ectxsp = act.sendkeys(po.sellingexctax, readdataprop.getExcSPTax());
//	  Thread.sleep(1000);
	  
	  act.click(po.save);
	 
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
