package elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products {

public WebDriver driver;
	
	public  Products(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;	
	}

	@FindBy(xpath = "/html/body/div[2]/div[1]/section[1]/h1")
	public WebElement addnewproduct;
	
					@FindBy(xpath = "//*[@id=\"name\"]")
					public WebElement productname;
					
					@FindBy(xpath = "//*[@id=\"select2-brand_id-container\"] ")
					public WebElement brand;
					
					@FindBy(xpath = "//*[@id=\"product_add_form\"]/div[1]/div/div/div[3]/div/div/span[2]/button")
					public WebElement addunitbutton;
					
					@FindBy(xpath = "//*[@id=\"unit_id\"]")
					public WebElement unit;
					
//					@FindBy(xpath = "//*[@id=\"select2-barcode_type-container\"]")
					@FindBy(xpath = "//*[@id=\"barcode_type\"]")
					public WebElement barcode;
					
					@FindBy(xpath = "//*[@id=\"alert_quantity\"]")
					public WebElement alertquantity;
					
					@FindBy(xpath = "//*[@id=\"single_dpp\"]")
					public WebElement purchaseexctax;
					
					@FindBy(xpath = "//*[@id=\"single_dpp_inc_tax\"]")
					public WebElement purchaseinctax;
					
//					@FindBy(xpath = "//*[@id=\"single_dsp\"]")
//					public WebElement sellingexctax;
					
					@FindBy(xpath = "//*[@id=\"select2-tax_type-container\"]")
					public WebElement sellingpricetype;
					
					@FindBy(xpath = "//*[@id=\"type\"]")
					public WebElement producttype;
				
					@FindBy(xpath = "//*[@id=\"product_add_form\"]/div[4]/div/div/div/button[4]")
					public WebElement save;
					
	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[8]/a")
	public WebElement units;
					@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
					public WebElement addunit;
					
					@FindBy(xpath = "//*[@id=\"actual_name\"]")
					public WebElement nameunit;
					
					
					@FindBy(xpath = "//*[@id=\"short_name\"]")
					public WebElement shortname;
					
					//*[@id="allow_decimal"]
					@FindBy(xpath = "//*[@id=\"allow_decimal\"]")
					public WebElement decimalunit;
					//*[@id="quick_add_unit_form"]/div[3]/button[1]
					@FindBy(xpath = "//*[@id=\"quick_add_unit_form\"]/div[3]/button[1]")
					public WebElement saveunit;
					
					@FindBy(xpath = "//*[@id=\"unit_add_form\"]/div[3]/button[2]")
					public WebElement closeunit;
					
					@FindBy(xpath = "//*[@id=\"unit_table_filter\"]/label/input")
					public WebElement searchunit;
				
	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[9]/a")
	public WebElement categories;
	
					
					@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
					public WebElement addcategori;
					
					@FindBy(xpath = "//*[@id=\"name\"]")
					public WebElement categoriname;
					
					@FindBy(xpath = "//*[@id=\"short_code\"]")
					public WebElement categoricode;
					
					@FindBy(xpath = "//*[@id=\"category_add_form\"]/div[3]/button[1]")
					public WebElement savecategori;
					
					@FindBy(xpath = "//*[@id=\"category_add_form\"]/div[3]/button[2]")
					public WebElement closecategori;
					
					@FindBy(xpath = "//*[@id=\"category_table_filter\"]/label/input")
					public WebElement searchcategori;
					
					
	@FindBy(xpath = "//*[@id=\"tour_step5\"]/ul/li[10]/a")
	public WebElement Brands;
	
					
					@FindBy(xpath = "/html/body/div[2]/div[1]/section[2]/div[1]/div[1]/div/button")
					public WebElement addbrand;
					
					@FindBy(xpath = "//*[@id=\"name\"]")
					public WebElement brandname;
					@FindBy(xpath = "//*[@id=\"description\"]")
					public WebElement shortdescribebrand;
					@FindBy(xpath = "//*[@id=\"brand_add_form\"]/div[3]/button[1]")
					public WebElement savebrand;
					@FindBy(xpath = "//*[@id=\"brand_add_form\"]/div[3]/button[2]")
					public WebElement closebrand;
					@FindBy(xpath = "//*[@id=\"brands_table_filter\"]/label/input")
					public WebElement searchbrand;
			
}
