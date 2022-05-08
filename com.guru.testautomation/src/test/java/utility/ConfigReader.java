package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	
	public ConfigReader() {
		
		
		
		try {
			File file = new File("./Configuration/config.property");
			FileInputStream fs = new FileInputStream(file);
			pro = new Properties();
			pro.load(fs);
		}
		
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getChromeDriverPath() {
		
		return pro.getProperty("ChromeDriverpath");
	}
	
	public String getUserID() {
		
		return pro.getProperty("UserID");
	}
	public String getPassword() {
		
		return pro.getProperty("password");
	}
	public String getURL() {
		
		return pro.getProperty("URL");
	}
	
	public String getCustomerName() {
		
		return pro.getProperty("CustomerName");
	}
	public String getGender() {
		
		return pro.getProperty("Gender");
	}
	public String getDateofBirth() {
		
		return pro.getProperty("DateofBirth");
	}
	public String getAddress() {
		
		return pro.getProperty("Address");
	}
	public String getCity() {
		
		return pro.getProperty("City");
	}
	public String getState() {
		
		return pro.getProperty("State");
	}
	public String getPIN() {
		
		return pro.getProperty("PIN");
	}
	public String getMobileNumber() {
		
		return pro.getProperty("MobileNumber");
	}
	public String getEmail() {
		
		return pro.getProperty("Email");
	}
	public String getPasswordCustomer() {
		
		return pro.getProperty("Password");
	}

}
