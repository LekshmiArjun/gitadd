package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigProperties {
Properties pro;
	
	public ReadConfigProperties() 
	{
		File src=new File("C:\\Users\\lechu\\eclipse-workspace newww\\Projectwork2\\src\\test\\resources\\config.properties");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
			pro=new Properties();
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	 
	public String getUserName()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPwd()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}
	
	public String getBrowser()
	{
		String browser=pro.getProperty("browser");
				return browser;
	}
	
	public String getUrl()
	{
		String url=pro.getProperty("url");
		return url;
	}
	
	public String getProductName()
	{
		String productname=pro.getProperty("productname");
		return productname;
	}
	
	public String getAlertQty()
	{
		String alertquantity=pro.getProperty("alertquantity");
		return alertquantity;
	}
	
	public String getExcTax()
	{
		String exctax=pro.getProperty("exctax");
		return exctax;
	}
	
	public String getExcSPTax()
	{
		String excsptax=pro.getProperty("excsptax");
		return excsptax;
	}
	public String getIncTax()
	{
		String inctax=pro.getProperty("inctax");
		return inctax;
	}
	
	public String getUnitName()
	{
		String unitname=pro.getProperty("unitname");
		return unitname;
	}
	
	public String getShortUnitName()
	{
		String shortuniname=pro.getProperty("shortuniname");
		return shortuniname;
	}
	
	
	public String getCatName()
	{
		String catname=pro.getProperty("catname");
		return catname;
	}
	
	public String getCatCode()
	{
		String catcode =pro.getProperty("catcode");
		return catcode;
	}
	
	public String getBrandName()
	{
		String brandename=pro.getProperty("brandname");
		return brandename;
	}
	
	public String getDescribebBrand()
	{
		String describrand=pro.getProperty("describrand");
		return describrand;
	}
	

}
