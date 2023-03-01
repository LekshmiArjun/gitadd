package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;
	
	public  Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
		
	}
//login
	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement username;
	

	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement password;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/form/div[3]/div/div/label")
	public WebElement rememberme;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/form/div[4]/div/button")
	public WebElement loginbutton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div/div[2]/form/div[4]/div/a")
	public WebElement forgotpassword;
	
}
