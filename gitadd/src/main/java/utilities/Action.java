package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Action {
	
	public WebDriver driver;
	
	public Action(WebDriver driver) {
		this.driver = driver;
	}

	//sendkeys
	public String sendkeys(WebElement element, String text) throws InterruptedException {
		Actions sendkeyo =new Actions(driver);
		sendkeyo.click(element).sendKeys(text).build().perform();
		return text;
	}

//click
	public void click(WebElement element) throws InterruptedException {
		Actions clicko =new Actions(driver);
		clicko.click(element).build().perform();
		
	}
//Alertccept
		public void alertaccept() throws InterruptedException {
		 Alert objalert = driver.switchTo().alert();
			objalert.accept();
		}
//Alert dismiss
		public void alertdismiss() throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			objalert.dismiss();
		}
//Alert sendtext
		public void alertsendtext(String value) throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			objalert.sendKeys(value);
		}

//Alert gettext
		public String alerttextmsg() throws InterruptedException {
			Alert objalert = driver.switchTo().alert();
			return objalert.getText(); 
		}
//dropdown
		public void dropDown(WebElement element,int z) throws InterruptedException  {			
			Select Dropcolour = new Select(element);
//			Dropcolour.selectByValue(a);
//			Thread.sleep(2000);
//			Dropcolour.selectByVisibleText(a);
//			Thread.sleep(2000);
			Dropcolour.selectByIndex(z);
			Thread.sleep(2000);
			 
		}
		
		public void dropDownde(WebElement element) throws InterruptedException {
			Select Dropcolour = new Select(element);
			Dropcolour.deselectAll();
			Thread.sleep(2000);
		}
}
