package july03_TestNG;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	//create object of Properties class
	Properties properties;
	String filepath = "";
	
	//constructor
	public ReadConfig()
	{
		try {
			properties = new Properties();
			FileInputStream fis = new FileInputStream(filepath);
			properties.load(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	
	
	//create method for browser and  Url key.
	public String getBrowser() 
	{
		String value = properties.getProperty("browser");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("browser is not spacified in config.properties file");
	}
	
	
	public String getBaseUrl() 
	{
		String value = properties.getProperty("");
		if(value!=null)
			return value;
		else
			throw new RuntimeException("baseUrl is not spacified in config.properties file");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
