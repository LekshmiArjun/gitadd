package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Brands {
public WebDriver driver;
	
	public  Brands(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[1]/h1")
	public WebElement addnewproduct;
					@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
					public WebElement addbrandbutton;
					
					@FindBy(xpath = "//*[@id=\"name\"] ")
					public WebElement brandname;
					
					@FindBy(xpath = "//*[@id=\"description\"]")
					public WebElement shortdescrip;
					
					@FindBy(xpath = "//*[@id=\"brand_add_form\"]/div[3]/button[1]")
					public WebElement save;
					
					@FindBy(xpath = "//*[@id=\"brand_add_form\"]/div[3]/button[2]")
					public WebElement close;
					
					@FindBy(xpath = "//*[@id=\"brands_table_filter\"]/label/input")
					public WebElement search;
}
