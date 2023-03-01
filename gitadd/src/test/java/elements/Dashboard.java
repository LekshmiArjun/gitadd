package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
public WebDriver driver;
	
	public  Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}

	@FindBy(xpath = "//*[@id=\"step-0\"]/div[3]/button[3]")
	public WebElement endtour;
	
	@FindBy(xpath = "//*[@id=\"tour_step5_menu\"]/span[1]")
	public WebElement products;
	
	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[2]/a")
	public WebElement addproducts;
}
